package com.infosharecomacademy.jsonfromurl;

import java.net.URI;

public class App {

    private static final URI API_ADDRES = URI.create("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=a");

    public static void main(String[] args) {
        Data data = new Data();
        String dataApi = data.getData(API_ADDRES);
        System.out.println(dataApi);
        ReadJson readJson = new ReadJson(dataApi);
        Drinks jsonData = readJson.getData();
        jsonData.getDrinks()
                .stream()
                .sorted((o1, o2) -> Integer.parseInt(o2.getIdDrink()) - Integer.parseInt(o1.getIdDrink()))
                .forEach(System.out::println);
    }
}
