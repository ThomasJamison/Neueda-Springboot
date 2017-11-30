package uk.ac.belfastmet.buildings.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.buildings.domain.Building;
import uk.ac.belfastmet.buildings.service.BuildingService;

@Controller
@RequestMapping("/")
public class BuildingController
{
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("pageTitle", "Largest Buildings In The World");
		return "index";
	}
	
	@GetMapping("/largestFloorArea")
	public String floorArea(Model model)
	{
		model.addAttribute("pageTitle", "Buildings By Floor Area");
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getLargestFloorArea());
		return "largestFloorArea";
	}
	
	@GetMapping("/largestFootprint")
	public String footprint(Model model)
	{
		model.addAttribute("pageTitle", "Buildings By Footprint");
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getLargestFootprint());
		return "largestFootprint";
	}
	
	@GetMapping("/largestUsableVolume")
	public String usableVolume(Model model)
	{
		model.addAttribute("pageTitle", "Buildings By Usable Volume");
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getLargestUsableVolume());
		return "largestUsableVolume";
	}



}