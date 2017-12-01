package uk.ac.belfastmet.dwarfs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Controller
@RequestMapping("/")
public class DisneyController
{
	@Autowired
	DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository) 
	{
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("pageTitle", "Dwarf Emporium");
		return "index";
	}
	
	@GetMapping("/disney")
	public String disney(Model model)
	{
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Disney"));
		return "disneyPage";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model)
	{
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));
		return "tolkienPage";
	}
	
	@GetMapping("/more")
	public String more(Model model)
	{
		model.addAttribute("dwarfs1", dwarfRepository.findTop3ByAuthor("Disney"));
		model.addAttribute("dwarfs2", dwarfRepository.findByName("Sleepy"));
		model.addAttribute("dwarfs3", dwarfRepository.findByDwarfId(11));
		model.addAttribute("dwarfs4", dwarfRepository.findByOrderByName());
		model.addAttribute("dwarfs5", dwarfRepository.findByAuthorOrName("Disney", "Thorin"));
		return "morePage";
	}



}
