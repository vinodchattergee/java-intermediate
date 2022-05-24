package com.intermediate.oops.inheritance.athlete;

public class FootballPlayer extends Athlete{

    private int goalsScored;

    public FootballPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed,int goalsScored) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.goalsScored=goalsScored;
    }

    @Override
    protected void getBio() {
        super.getBio();
        System.out.println("Goals Scored "+ goalsScored);
    }
}
