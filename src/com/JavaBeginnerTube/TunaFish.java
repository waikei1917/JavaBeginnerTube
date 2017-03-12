package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 11/03/17.
 */
public class TunaFish {
    private String theName;

    public  TunaFish() {

    }
    public TunaFish(String name){
        theName = name;
    }

    public void simpleMessage() {
        System.out.println("Tuna fish");
    }

    public void simpleHelloMessage(String name) {
        System.out.println("Hello: " + name);
    }

    public void setName(String name) {
        theName = name;
    }

    public String getName() {
        return theName;
    }

    public void saying() {
        System.out.println("The name is " + getName());
        System.out.printf("The name is %s", getName());
    }
}
