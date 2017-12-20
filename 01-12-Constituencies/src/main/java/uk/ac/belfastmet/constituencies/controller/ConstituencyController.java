package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.Member;
import uk.ac.belfastmet.constituencies.domain.Members;

@Controller
@RequestMapping("")
public class ConstituencyController
{
	
	public ConstituencyController()
	{
		
	}
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Events");
		
		
		return "homePage";
	}
	
	@GetMapping("/constituency/{constituencyId}")
	public String singleEvent(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");
		
		//using an edited version of the original json because its terrible
		String membersUrl = "https://api.myjson.com/bins/y888n";
		
		RestTemplate restTemplate = new RestTemplate();
		Members members = restTemplate.getForObject(membersUrl, Members.class);
		ArrayList<Member> requestedMembers = new ArrayList<Member>();
		

		for(Member member: members.getAllMembers())
		{
			
			if (member.getConstituencyId().equals(constituencyId))
			{
				requestedMembers.add(member);
			}

		}
				
		model.addAttribute("members", requestedMembers);
		return "mlaPage";
	}
}
