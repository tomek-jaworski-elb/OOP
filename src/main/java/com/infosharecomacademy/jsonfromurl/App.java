package com.infosharecomacademy.jsonfromurl;

import java.net.URI;
import java.util.List;
import java.util.stream.Stream;

public class App {

    private static final URI API_ADDRESS_A = URI.create("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=a");
    private static final URI API_ADDRESS_M = URI.create("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=m");
    private static final URI API_ADDRESS_T = URI.create("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=t");

    public static void main(String[] args) {
        Data data = new Data();
        String data0 = data.getData(API_ADDRESS_M);
        ReadJson readJson0 = new ReadJson(data0);

        String data1 = data.getData(API_ADDRESS_A);
        ReadJson readJson1 = new ReadJson(data1);

        String data2 = data.getData(API_ADDRESS_T);
        ReadJson readJson2 = new ReadJson(data2);

        System.out.println("*******************");
        List<Drink> drinkList = Stream.concat(readJson0.getData().getDrinks().stream(),
                readJson1.getData().getDrinks().stream()).toList();
        drinkList = Stream.concat(drinkList.stream(), readJson2.getData().getDrinks().stream()).toList();
        drinkList.stream()
                .sorted((o1, o2) -> Integer.parseInt(o1.getIdDrink()) - Integer.parseInt(o2.getIdDrink()))
                .forEach(System.out::println);
        System.out.println("Size: " + (long) drinkList.size());
    }
}
