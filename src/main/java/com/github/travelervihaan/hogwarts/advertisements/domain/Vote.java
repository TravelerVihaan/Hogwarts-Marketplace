package com.github.travelervihaan.hogwarts.advertisements.domain;

public enum Vote {
    UP(1),
    DOWN(-1);

    private final int value;

    Vote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Vote: " + value;
    }
}
