package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 14/03/17.
 */
public class StaticTuna {
    private String first;
    private String last;
    private static int members = 0;

    public StaticTuna(String fn, String ln) {
        first = fn;
        last = ln;
        members++;
        System.out.printf("Contrustor for %s %s, members in the club: %d\n", first, last, members);
    }

    public String getFirst() {
        return first;
    }

    public String getLast () {
        return last;
    }

    public static int getMembers() {
        return members;
    }
}
