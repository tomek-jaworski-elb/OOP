package com.infosharecomacademy.developer;

public class Developer {
    final Integer ID;
    final String name;
    final Skill skill;

    public Developer(Integer ID, String name, Skill skill) {
        this.ID = ID;
        this.name = name;
        this.skill = skill;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }
}
