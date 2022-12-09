package com.ab.tennisgame.tennisgame1;

import com.ab.tennisgame.TennisGame;

public class TennisGame1 implements TennisGame {
    Player player1;
    Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName())){
            player1.addScore();
        } else if (playerName.equals(player2.getName())) {
            player2.addScore();
        } else {
            throw new IllegalArgumentException("Invalid player name");
        }
    }

    public String getScore() {
        if (player1.getScore()>=4 || player2.getScore()>=4 || player1.getScore() == player2.getScore()) {
            int scoreDifference = player1.getScore()-player2.getScore();
            return getOutputForScoreDifference(scoreDifference);
        }
        return scoreDescription(player1.getScore()) + "-" + scoreDescription(player2.getScore());
    }

    private String getOutputForScoreDifference(int scoreDifference) {
        String score;
        if (scoreDifference ==1) {
            score ="Advantage player1";
        } else if (scoreDifference ==-1) {
            score ="Advantage player2";
        } else if (scoreDifference == 0){
            score = getOutputForEqualScore();
        } else if (scoreDifference >=2) {
            score = "Win for player1";
        } else {
            score ="Win for player2";
        }
        return score;
    }

    private String getOutputForEqualScore() {
        String score;
        int currentScore = player1.getScore();
        if(currentScore >= 3){
            score = "Deuce";
        } else {
            score = scoreDescription(currentScore) + "-All";
        }
        return score;
    }

    private static String scoreDescription(int currentScore) {
        return ScoreDescription.values()[currentScore].toString();
    }
}
