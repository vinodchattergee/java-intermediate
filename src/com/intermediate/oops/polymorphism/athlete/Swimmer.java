package com.intermediate.oops.polymorphism.athlete;

public class Swimmer extends Athlete {
    private int finaPoints;

    public Swimmer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
    }

    @Override
    public String getBodyType() {
        return "Muscular but flexible";
    }

    @Override
    protected void getBio() {
        super.getBio();
        System.out.println("Swimming point " + finaPoints);
    }

    public void swim(int points) {
        finaPoints += points;
    }

}
