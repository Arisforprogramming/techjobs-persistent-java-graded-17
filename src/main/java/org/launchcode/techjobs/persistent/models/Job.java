package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
//public class Job extends AbstractEntity {
//
//    @ManyToOne
//    private Employer employer;
//
//    public Employer getEmployer() {
//
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//    public Job() {
//    }
//
//    @ManyToMany(mappedBy = "jobs") // `mappedBy` refers to the "jobs" field in the Skill class
//    private List<Skill> skills = new ArrayList<>();// Initialize with an empty list
//
//    // Initialize the id and value fields.
//    public Job(Employer anEmployer, List<Skill> someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }
//    //(List<Job> jobs)
//    // Getters and setters.
//
//    public List<Skill> getSkills() {
//
//        return skills;
//    }
//
//    public void setSkills(List<Skill> skills) {
//        this.skills = skills;
//    }
//
//}

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}

