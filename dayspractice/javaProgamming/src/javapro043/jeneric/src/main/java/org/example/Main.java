package org.example;

public class Main {
    public static void main(String[] args) {
       FootballPlayer joe = new FootballPlayer("joe");
       BasablePlayer leo = new BasablePlayer("leo");
       SoccerPlayer keo = new SoccerPlayer("keo");

       Team<SoccerPlayer> liver = new Team("liver");
       //liver.addPlayer(joe);
       //liver.addPlayer(leo);
       liver.addPlayer(keo);
       Team<BasablePlayer> brokenTeam = new Team<>("rong");


    }
}
