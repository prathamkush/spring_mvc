package org.spring.mvc.controller;

import org.spring.mvc.PlayerService;
import org.spring.mvc.entityComponent.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PlayerController {

    @Autowired
    PlayerService service;

    @RequestMapping(value = "/searchPlayerForm")
    public String searchPlayerForm(){
        return "search-player-form";
    }


//    @RequestMapping(value = "/showPlayerDetails")
//    public String showPlayerDetails(HttpServletRequest request, Model model){
//        String pName = request.getParameter("playerName");
//
//        Player player = service .getPlayerByName(pName);
//
//        model.addAttribute("id", player.getId());
//        model.addAttribute("name",player.getName());
//        model.addAttribute("age",player.getAge());
//        model.addAttribute("nationality", player.getNationality());
//        return "show-player-details";
//    }

    // Using @RequestParam

    @RequestMapping(value = "/showPlayerDetails")
    public String showPlayerDetails(@RequestParam(value = "playerName", defaultValue = "Alice") String pName, Model model){

        Player player = service.getPlayerByName(pName);

        model.addAttribute("id", player.getId());
        model.addAttribute("name",player.getName());
        model.addAttribute("age",player.getAge());
        model.addAttribute("nationality", player.getNationality());
        return "show-player-details";
    }


}
