package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 14/03/17.
 */
public class FinalTuna {
    private int sum;
    private final int NUMBER;

    public FinalTuna(int x) {
        NUMBER =x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("sum=%d\n",sum);
    }
}
