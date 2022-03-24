package com.infosharecomacademy.jsonfromurl;

public class Drink {

    private String idDrink;
    private String strDrink;

    public String getIdDrink() {
        return idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Drink{");
        sb.append("idDrink='").append(idDrink).append('\'');
        sb.append(", strDrink='").append(strDrink).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
