package uk.ac.belfastmet.titanic.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
import uk.ac.belfastmet.titanic.repositories.PassengerRepository;

@Controller
@RequestMapping("/")
public class TitanicController
{
	@Autowired
	PassengerRepository passengerRepository;
	
	public TitanicController(PassengerRepository passengerRepository) 
	{
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
	
	@GetMapping("/passengers/view/{passengerId}")
    public String viewPassenger(@PathVariable Integer passengerId, Model model)
    {
    	model.addAttribute("pageTitle", "View Passenger");
    	model.addAttribute("passenger", passengerRepository.findOne(passengerId));
    	return "viewPassenger";
    }
	
    @GetMapping("/passengers/edit/{passengerId}")
    public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model)
    {
    	model.addAttribute("pageTitle", "Edit Passenger");
    	model.addAttribute("passenger", passengerRepository.findOne(passengerId));
    	return "editPassenger";
    }
    
    @GetMapping("/passengers/add")
    public String createCereal(Model model)
    {
    	model.addAttribute("pageTitle", "Add Passenger");
    	model.addAttribute("passenger", new Passenger());
    	return "editPassenger";
    }
    
    @PostMapping("/passengers/save")
    public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model)
    {
    	if(bindingResult.hasErrors())
    	{
    		return "editPassenger";
    	}
    	else
    	{
        	Passenger savedPassenger = passengerRepository.save(passenger);
        	return "redirect:/passengers/view/" + savedPassenger.getPassengerId();
    	}
    	
    }
    
    @GetMapping("/passengers/delete/{passengerId}")
    public String deletePassenger(@PathVariable("passengerId") Integer passengerId, 
    							  RedirectAttributes redirectAttrs)
    {
    	passengerRepository.delete(passengerId);
    	redirectAttrs.addFlashAttribute("message", "Passenger " + passengerId + " deleted");
    	return "redirect:/passengers";
    }


}
