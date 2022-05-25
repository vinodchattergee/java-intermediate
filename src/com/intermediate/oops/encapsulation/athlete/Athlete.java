package com.intermediate.oops.encapsulation.athlete;

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

    public void playGame(){
        System.out.println("Name : "+name+" started a game.");
        gamesPlayed++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
