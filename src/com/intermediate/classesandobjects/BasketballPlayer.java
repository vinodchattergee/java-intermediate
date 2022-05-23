package com.intermediate.classesandobjects;

import java.util.Random;

public class BasketballPlayer {
    String name;
    String nickName;
    int yearOfBorn;
    String team;
    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BasketballPlayer(String name, String nickName, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow() {
        Random randomNumberGenerator=new Random();
        if(randomNumberGenerator.nextDouble()*100>freeThrowPercentage){
            System.out.println(name+ " failed to score freethrow!");
        }else{
            System.out.println(name+ " succeeded to score freethrow!");
        }
    }
}
