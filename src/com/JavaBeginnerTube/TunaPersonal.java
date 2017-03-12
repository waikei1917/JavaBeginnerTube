package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 12/03/17.
 */
public class TunaPersonal {
    private String name;
    private potpie birthday;

    public TunaPersonal(String theName, potpie theData) {
        name = theName;
        birthday = theData;
    }

    public  String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
