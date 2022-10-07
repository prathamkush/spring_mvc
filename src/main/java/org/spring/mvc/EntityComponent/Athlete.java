package org.spring.mvc.EntityComponent;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Athlete {
    private String name;
    private String country;
    private String rank;
    private String[] tournaments;
    public Athlete(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRank() {
        return rank;
    }

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rank='" + rank + '\'' +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
