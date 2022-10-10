package org.spring.mvc.entityComponent;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Arrays;

@Component
public class Athlete {

//    @NotNull(message = "This is a REQUIRED field")
//    @Size(min = 1, message = "This is a REQUIRED filed") //, message = "This is a REQUIRED field. Must be Greater than 1")

    //@NotEmpty(message = "This is a Required Field")
    //@NotNull(message = "This is a REQUIRED field")

    @Size(min = 1, message = "This is a REQUIRED filed")
    @NotNull(message = "This is a REQUUIRED Field")
    private String name;
    private String country;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Past(message = "Date must be in the past")
    private Date dob;

    @NotNull(message = "This is a Required Field")
    private String rank;


    // pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Please enter a valid Email Address")
    private String email;


    @Min(value = 1, message = "Value must be >= 1")
    @Max(value = 10, message = "Value must be <= 10")
    @NotNull(message = "This is a required field")
    private int designation;
    private String[] tournaments;
    public Athlete(){}

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

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
                ", dob=" + dob +
                ", rank='" + rank + '\'' +
                ", email='" + email + '\'' +
                ", designation=" + designation +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
