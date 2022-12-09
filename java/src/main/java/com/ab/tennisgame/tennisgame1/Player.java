package com.ab.tennisgame.tennisgame1;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void addScore(){
        score++;
    }

    public int getScore() {
        return score;
    }
}
