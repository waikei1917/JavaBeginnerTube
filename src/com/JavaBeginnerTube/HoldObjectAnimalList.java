package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 15/03/17.
 */
public class HoldObjectAnimalList {
    private HoldObjectAnimal[] thelist = new HoldObjectAnimal[5];
    private int i = 0;

    public void add(HoldObjectAnimal a) {
        if (i<thelist.length) {
            thelist[i] = a;
            System.out.println("Animal added at index "+i);
            i++;
        }
    }
}
