package org.spring.mvc.service;

import org.spring.mvc.EntityComponent.Player;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private List<Player> players = Arrays.asList(new Player(1,"Alice",22,"BRITISH"),
                                                new Player(2,"Bob",39,"INDIAN"),
                                                new Player(3,"Carol",20,"BRITISH"),
                                                new Player(4,"Dave",16,"KOREAN")
    );

    public Player getPlayerByName(String name){
        Optional<Player> player = players.stream().filter(p -> p.getName().equals(name)).findFirst();
        if(player.isPresent())
            return player.get();
        return new Player(-1,"No Name",-1,"No_Nationality");
    }

}
