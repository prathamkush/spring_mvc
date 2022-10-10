package org.spring.mvc.entityComponent;

import org.spring.mvc.validation.HeadToHead;

import javax.validation.constraints.NotNull;

public class PlayerStats {

    private String player1;
    private String player2;
    private String player3;


    @NotNull(message = "Required Field")
    @HeadToHead
    private String headToHead;


    public  PlayerStats(){}


    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public void setPlayer3(String player3) {
        this.player3 = player3;
    }

    public String getHeadToHead() {
        return headToHead;
    }

    public void setHeadToHead(String headToHead) {
        this.headToHead = headToHead;
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                ", player3='" + player3 + '\'' +
                ", headToHead='" + headToHead + '\'' +
                '}';
    }
}
