package org.spring.mvc.controller;

import org.spring.mvc.EntityComponent.Athlete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

    @RequestMapping("/showAthleteForm")
    public String showAthleteForm(Model model){
        model.addAttribute("athlete", new Athlete());
        return "add-athlete-form";
    }

    @RequestMapping("/showAthleteDetails")
    public String showAthleteDetails(@ModelAttribute("athlete") Athlete myAthlete){
        System.out.println(myAthlete);
        return "show-athlete-details";
    }

}

//<%
//        for (String tour: ${athlete.tournament}){
//<li>${tour}</li>
//        }
//
//        %>
