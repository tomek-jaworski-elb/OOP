package com.infosharecomacademy.developer;

public class Developer {
    private final Long id;
    private final String name;
    private final Skill skill;

    public Developer(Long id, String name, Skill skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }
}
