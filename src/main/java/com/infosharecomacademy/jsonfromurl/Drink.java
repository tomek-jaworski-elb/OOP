package com.infosharecomacademy.jsonfromurl;

import java.util.Objects;

public class Drink {

    private String idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strGlass;
    private String dateModified;


    public String getIdDrink() {
        return idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(idDrink, drink.idDrink) && Objects.equals(strDrink, drink.strDrink) && Objects.equals(strCategory, drink.strCategory) && Objects.equals(strAlcoholic, drink.strAlcoholic) && Objects.equals(strGlass, drink.strGlass) && Objects.equals(dateModified, drink.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDrink, strDrink, strCategory, strAlcoholic, strGlass, dateModified);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Drink{");
        sb.append("idDrink='").append(idDrink).append('\'');
        sb.append(", strDrink='").append(strDrink).append('\'');
        sb.append(", strCategory='").append(strCategory).append('\'');
        sb.append(", strAlcoholic='").append(strAlcoholic).append('\'');
        sb.append(", strGlass='").append(strGlass).append('\'');
        sb.append(", dateModified='").append(dateModified).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
