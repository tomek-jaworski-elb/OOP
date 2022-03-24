package com.infosharecomacademy.jsonfromurl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ReadJson {

    private final String json;

    public ReadJson(String json) {
        this.json = json;
    }

    public String getJson() {
        return json;
    }

    public Drinks getData() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        Drinks drinks = gson.fromJson(json, Drinks.class);
        return drinks;
    }
}
