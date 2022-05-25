package com.intermediate.statickeyword;

public class CountriesApp {
    public static void main(String[] args) {
        System.out.println("Number of countries "+ Country.getNumberOfContries());
        Country india=new Country("India");
        india.getDetails();
        Country burma=new Country("Burma");
        burma.getDetails();
        Country bhutan=new Country("Bhutan");
        bhutan.getDetails();
        System.out.println("Number of countries "+ Country.getNumberOfContries());

    }
}
