package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @Size(min = 1, max = 100)
    public String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    //    public void setLocation(String saintLouis) {
    // }
    public void setLocation(String location) {
        this.location = location;
    }
}
