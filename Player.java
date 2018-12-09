package com.example.blairwang.ttt;

public class Player {
    private String gameHistory;
    private int score;

    public Player() {
        gameHistory = "";
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    public String getGameHistory() {
        return gameHistory;
    }

    public void addToGameHistory(String result) {

    }
}
