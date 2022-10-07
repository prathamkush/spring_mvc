package org.spring.mvc.entityComponent;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.Arrays;

@Component
public class Athlete {

//    @NotNull(message = "This is a REQUIRED field")
//    @Size(min = 1, message = "This is a REQUIRED filed") //, message = "This is a REQUIRED field. Must be Greater than 1")

    @NotEmpty(message = "This is a Required Field")
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
