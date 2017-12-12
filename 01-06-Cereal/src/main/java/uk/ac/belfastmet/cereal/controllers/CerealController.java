package uk.ac.belfastmet.cereal.controllers;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereal.domain.BreakfastCereal;
import uk.ac.belfastmet.cereal.repositories.CerealRepository;


@Controller
@RequestMapping("/")
public class CerealController
{
	@Autowired
	CerealRepository cerealRepository;
	
	@GetMapping("/")
    public String home(Model model)
    {
		   model.addAttribute("pageTitle", "Cereal Home");
           return "homePage";
    }
    
    @GetMapping("/cereal")
    public String result(Model model)
    {
    	   model.addAttribute("pageTitle", "Cereal List");
           model.addAttribute("cereals", cerealRepository.findAll());
           return "cerealPage";
    }
    
    @GetMapping("/cereal/view/{cerealId}")
    public String viewCereal(@PathVariable Integer cerealId, Model model)
    {
    	model.addAttribute("pageTitle", "View Cereal");
    	model.addAttribute("cereal", cerealRepository.findOne(cerealId));
    	return "viewCereal";
    }
    
    @GetMapping("/cereal/edit/{cerealId}")
    public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model)
    {
    	model.addAttribute("pageTitle", "Edit Cereal");
    	model.addAttribute("cereal", cerealRepository.findOne(cerealId));
    	return "editCereal";
    }
    
    @GetMapping("/cereal/delete/{cerealId}")
    public String deleteCereal(@PathVariable("cerealId") Integer cerealId)
    {
    	cerealRepository.delete(cerealId);
    	return "redirect:/";
    }
    
    @GetMapping("/cereal/add")
    public String createCereal(Model model)
    {
    	model.addAttribute("pageTitle", "Add Cereal");
    	model.addAttribute("cereal", new BreakfastCereal());
    	return "editCereal";
    }
    
    
    @PostMapping("/cereal/save")
    public String saveCereal(@Valid BreakfastCereal cereal, BindingResult bindingResult, Model model)
    {
    	if(bindingResult.hasErrors())
    	{
    		return "editCereal";
    	}
    	else
    	{
        	BreakfastCereal savedCereal = cerealRepository.save(cereal);
        	return "redirect:/cereal/view/" + savedCereal.getCerealId();
    	}
    	
    }
}