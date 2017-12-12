package uk.ac.belfastmet.cereal.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class CerealController
{

	@GetMapping("/")
    public String home(Model model)
    {
           return "homePage";
    }
    
    @GetMapping("/cereal")
    public String result(Model model)
    {

           //model.addAttribute("firstName", firstName);
           return "cerealPage";
    }
}