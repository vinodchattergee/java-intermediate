package com.intermediate.statickeyword;


public class Country {
    private final String NAME;

    private static int numberOfContries;

    public Country(String name) {
        NAME = name;
        numberOfContries++;
    }


    public void getDetails() {
        System.out.println("Country name " + NAME);

    }

    public static int getNumberOfContries() {
        return numberOfContries;
    }
}
