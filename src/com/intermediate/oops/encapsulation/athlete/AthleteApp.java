package com.intermediate.oops.encapsulation.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe brayan", "black mamba", 1978, "lakers", 83.7, 25.0, 1346);
        BasketballPlayer jordan = new BasketballPlayer("Micheal Jordan", "MJ", 1963, "chicago", 83.5, 30.1, 1072);
        BasketballPlayer magic = new BasketballPlayer("Ervin Johnson", "magic", 1959, "lakers", 84.8, 19.5, 906);

        FootballPlayer ronaldo = new FootballPlayer("Cristiano Ronaldo", "Goal Machine", 1978, "Portuguese", 83, 1346);
        FootballPlayer messi = new FootballPlayer("Loenel Messi", "Trumpcard", 1963, "Argentina", 85, 1072);
        messi.setTeam("Tesco");

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = ronaldo;
        footballPlayers[1] = messi;

        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            basketballPlayer.getBio();
            System.out.println("------------------------");
            basketballPlayer.playGame();
            basketballPlayer.getBio();
            System.out.println("------------------------");
        }

        for (FootballPlayer footballPlayer : footballPlayers) {
            footballPlayer.getBio();
            System.out.println("------------------------");
            footballPlayer.increaseCompletion(5);
            footballPlayer.increasePassingYards(10);
            footballPlayer.getBio();
            System.out.println("------------------------");
        }
    }
}
