package com.intermediate.oops.polymorphism.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {

    double freeThrowPercentage;
    double pointsPerGame;


    public BasketballPlayer(String name, String nickName, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow() {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextDouble() * 100 > freeThrowPercentage) {
            System.out.println(getName() + " failed to score freethrow!");
        } else {
            System.out.println(getName() + " succeeded to score freethrow!");
        }
    }

    @Override
    protected void getBio() {
        super.getBio();
        System.out.println("Freethrow % "+ freeThrowPercentage);
        System.out.println("Points per game "+ pointsPerGame);
    }

    @Override
    public void playGame() {
        super.playGame();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Lean and tall!";
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
