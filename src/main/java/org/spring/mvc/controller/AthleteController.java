package org.spring.mvc.controller;

import org.spring.mvc.entityComponent.Athlete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

    @RequestMapping("/showAthleteForm")
    public String showAthleteForm(Model model){
        model.addAttribute("athlete", new Athlete());
        return "add-athlete-form";
    }

    @RequestMapping("/showAthleteDetails")
    public String showAthleteDetails(@Valid @ModelAttribute("athlete") Athlete myAthlete, BindingResult result){
        System.out.println("Athlete Details : "+myAthlete);
        if(result.hasErrors()){
            return "add-athlete-form";
        }

        return "show-athlete-details";
    }

}

//<%
//        for (String tour: ${athlete.tournament}){
//<li>${tour}</li>
//        }
//
//        %>
