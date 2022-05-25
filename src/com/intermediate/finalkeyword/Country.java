package com.intermediate.finalkeyword;

public class Country {
    private final String NAME;
    private int population;
    private String capital;

    public Country(String name) {
        NAME = name;
    }


   public final void setPopulation(int change){
        population+=change;
   }
}
