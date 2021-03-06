package uk.ac.belfastmet.titanic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repositories.PassengerRepository;

@Controller
@RequestMapping("/")
public class TitanicController
{
	@Autowired
	PassengerRepository passengerRepository;
	
	public TitanicController(PassengerRepository passengerRepository) 
	{
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Titanic");
		return "homePage";
	}
	
	
	@GetMapping("/passengers")
	public String passenger(Model model)
	{
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", passengerRepository.findAll());
		return "passengersPage";
	}
	
	@GetMapping("/more")
	public String more(Model model)
	{
		model.addAttribute("passengersByAge", passengerRepository.findByAgeLessThan(18));
		model.addAttribute("passengersSurvived", passengerRepository.findBySurvived(1));
		model.addAttribute("passengersDied", passengerRepository.findBySurvived(0));
		return "morePage";
	}



}
