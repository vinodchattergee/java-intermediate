package com.intermediate.oops.inheritance.athlete;

public class Athlete {
    private String name;
    private String nickName;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    protected String getName() {
        return this.name;
    }

    protected void getBio() {
        System.out.println("-----------------");
        System.out.println("Name " + name);
        System.out.println("Nickname " + nickName);
        System.out.println("Born " + yearOfBorn);
        System.out.println("Team " + team);

    }
}
