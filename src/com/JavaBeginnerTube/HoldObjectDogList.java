package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 15/03/17.
 */
public class HoldObjectDogList {
    private HoldObjectDog[] thelist = new HoldObjectDog[5];
    private int i = 0;

    public void add(HoldObjectDog d) {
        if (i<thelist.length) {
            thelist[i] = d;
            System.out.println("Dog added at index "+i);
            i++;
        }
    }
}
