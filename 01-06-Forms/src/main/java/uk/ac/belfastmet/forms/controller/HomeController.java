package uk.ac.belfastmet.forms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController
{

	@GetMapping("/")
    public String home(Model model)
    {
           return "formPage";
    }
    
    @PostMapping("/result")
    public String result(@RequestParam("firstname")String firstName, @RequestParam("lastname")String lastName,
    		@RequestParam("gender")String gender, Model model)
    {

           model.addAttribute("firstName", firstName);
           model.addAttribute("lastName", lastName);
           model.addAttribute("gender", gender);
           
           return "resultPage";
    }
    
    @GetMapping("/result")
    public String getresults(Model model)
    {
    	model.addAttribute("firstName", "Chuck");
    	model.addAttribute("lastName", "Norris");
    	model.addAttribute("gender", "All of them");
    	return "resultPage";
    }

	
}
