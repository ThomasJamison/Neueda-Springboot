package uk.ac.belfastmet.rhi.controllers;

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

import uk.ac.belfastmet.rhi.domain.Beneficiary;
import uk.ac.belfastmet.rhi.repositories.RHIRepository;


@Controller
@RequestMapping("/")
public class RHIController
{
	@Autowired
	RHIRepository rhiRepository;
	
    
    @GetMapping("/")
    public String result(Model model)
    {
    	   model.addAttribute("pageTitle", "Beneficiary List");
           model.addAttribute("beneficiaries", rhiRepository.findAll());
           return "beneficiaryPage";
    }
    
    @GetMapping("/view/{beneficiaryId}")
    public String viewBeneficiary(@PathVariable Integer beneficiaryId, Model model)
    {
    	model.addAttribute("pageTitle", "View Beneficiary");
    	model.addAttribute("beneficiary", rhiRepository.findOne(beneficiaryId));
    	return "viewBeneficiary";
    }
    
    @GetMapping("edit/{beneficiaryId}")
    public String editBeneficiary(@PathVariable("beneficiaryId") Integer beneficiaryId, Model model)
    {
    	model.addAttribute("pageTitle", "Edit Beneficiary");
    	model.addAttribute("beneficiary", rhiRepository.findOne(beneficiaryId));
    	return "editBeneficiary";
    }
    
    @GetMapping("/add")
    public String createBeneficiary(Model model)
    {
    	model.addAttribute("pageTitle", "Add Beneficiary");
    	model.addAttribute("beneficiary", new Beneficiary());
    	return "editBeneficiary";
    }
    
    @PostMapping("/save")
    public String saveBeneficiary(@Valid Beneficiary beneficiary, BindingResult bindingResult, Model model)
    {
    	if(bindingResult.hasErrors())
    	{
    		return "editBeneficiary";
    	}
    	else
    	{
        	Beneficiary savedBeneficiary = rhiRepository.save(beneficiary);
        	return "redirect:/view/" + savedBeneficiary.getBeneficiaryId();
    	}
    	
    }
    
    @GetMapping("/delete/{beneficiaryId}")
    public String deleteBeneficiary(@PathVariable("beneficiaryId") Integer beneficiaryId, 
    							  RedirectAttributes redirectAttrs)
    {
    	rhiRepository.delete(beneficiaryId);
    	redirectAttrs.addFlashAttribute("message", "Beneficiary " + beneficiaryId + " deleted");
    	return "redirect:/";
    }
}
