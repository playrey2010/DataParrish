package com.example.demo;

import javax.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String projectTitle;
    private String projectObjective;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String projectFeatures; // this field could have a more specific name


    // section for project categories (private Category category)


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectObjective() {
        return projectObjective;
    }

    public void setProjectObjective(String projectObjective) {
        this.projectObjective = projectObjective;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProjectFeatures() {
        return projectFeatures;
    }

    public void setProjectFeatures(String projectFeatures) {
        this.projectFeatures = projectFeatures;
    }


}
