package com.intermediate.oops.polymorphism.athlete;

public class FootballPlayer extends Athlete {

    private int goalsScored;
    private int completions;
    private int passingYards;

    public FootballPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed, int goalsScored) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.goalsScored = goalsScored;
    }

    @Override
    protected void getBio() {
        super.getBio();
        System.out.println("Goals Scored " + goalsScored);
        System.out.println("Completions " + completions);
        System.out.println("Passing Yards " + passingYards);
    }

    @Override
    public String getBodyType() {
        return "Muscular and lean";
    }

    public void increaseCompletion(int completions) {
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards) {
        this.passingYards += passingYards;
    }
}
