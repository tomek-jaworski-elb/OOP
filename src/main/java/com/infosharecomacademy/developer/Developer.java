package com.infosharecomacademy.developer;

public class Developer {
    private final Long ID;
    private final String name;
    private final Skill skill;

    public Developer(Long ID, String name, Skill skill) {
        this.ID = ID;
        this.name = name;
        this.skill = skill;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }
}
