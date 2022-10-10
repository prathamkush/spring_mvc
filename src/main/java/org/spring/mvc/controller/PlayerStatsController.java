package org.spring.mvc.controller;

import org.spring.mvc.entityComponent.Athlete;
import org.spring.mvc.entityComponent.PlayerStats;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/stats")
public class PlayerStatsController {

    @RequestMapping("/showPlayerStatsForm")
    public String showPlayerStatsForm(Model model){
        model.addAttribute("playerStats", new PlayerStats());
        return "head-to-head-form";
    }

    @RequestMapping("/showHeadToHeadStats")
    public String showHeadToHeadStatsDetails(@Valid @ModelAttribute("playerStats")PlayerStats myPlayer, BindingResult result){
        System.out.println("Stats Details : "+myPlayer);
        if(result.hasErrors()){
            System.out.println(result);
            return "head-to-head-form";
        }

        return "head-to-head-stats";
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor editor = new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class, editor);
    }


}
