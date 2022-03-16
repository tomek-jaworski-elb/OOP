package com.infosharecomacademy.developer;

import java.util.*;

public class App {

    public static void main(String[] args) {

        List<Developer> developers = new ArrayList<>();

        developers.add(new Developer(13L, "Tomek", Skill.JAVA));
        developers.add(new Developer(15L, "Tomek", Skill.JAVA));
        developers.add(new Developer(1L, "Tomek", Skill.JAVA));
        developers.add(new Developer(100L, "Tomek", Skill.JS));
        developers.add(new Developer(200L, "Tomek", Skill.PYTHON));
        developers.add(new Developer(151L, "Tomek", Skill.SQL));
        developers.add(new Developer(777L, "Tomek", Skill.SQL));
        developers.add(new Developer(808L, "Tomek", Skill.JS));
        developers.add(new Developer(1L, "Tomek", Skill.PYTHON));
        developers.add(new Developer(55L, "Tomek", Skill.JAVA));

        Map<Skill, List<Long>> map = new EnumMap<>(Skill.class);

        for (Developer developer : developers) {
            map.putIfAbsent(developer.getSkill(), new ArrayList<>());
            List<Long> tmp = map.get(developer.getSkill());
            tmp.add(developer.getId());
            map.put(developer.getSkill(), tmp);
        }

        for (Map.Entry<Skill, List<Long>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
