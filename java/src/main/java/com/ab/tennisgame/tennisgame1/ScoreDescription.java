package com.ab.tennisgame.tennisgame1;

public enum ScoreDescription {
    ZERO("Love"),
    ONE("Fifteen"),
    TWO("Thirty"),
    THREE("Forty");

    private final String text;

    ScoreDescription(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
