package uk.ac.belfastmet.rhi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.rhi.domain.Beneficiary;
import uk.ac.belfastmet.rhi.repositories.RHIRepository;


@Controller
@RequestMapping("/")
public class RHIController
{
	@Autowired
	RHIRepository rhiRepository;
	
	@GetMapping("/")
    public String home(Model model)
    {
		   model.addAttribute("pageTitle", "Cereal Home");
           return "homePage";
    }
    
    @GetMapping("/beneficiary")
    public String result(Model model)
    {
    	   model.addAttribute("pageTitle", "Cereal List");
           model.addAttribute("cereals", rhiRepository.findAll());
           return "beneficiaryPage";
    }
}
