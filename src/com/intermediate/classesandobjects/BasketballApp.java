package com.intermediate.classesandobjects;

public class BasketballApp {
    public static void main(String[] args) {
        BasketballPlayer kobe=new BasketballPlayer("Kobe brayan","black mamba",1978,"lakers",83.7,25.0,1346);
        BasketballPlayer jordan=new BasketballPlayer("Micheal Jordan","MJ",1963,"chicago",83.5,30.1,1072);
        BasketballPlayer magic=new BasketballPlayer("Ervin Johnson","magic",1959,"lakers",84.8,19.5,906);

        BasketballPlayer[] basketballPlayers=new BasketballPlayer[3];
        basketballPlayers[0]=kobe;
        basketballPlayers[1]=jordan;
        basketballPlayers[2]=magic;

        for (BasketballPlayer basketballPlayer:basketballPlayers) {
            basketballPlayer.freeThrow();
        }
    }
}
