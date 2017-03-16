package com.JavaBeginnerTube;

import java.io.*;
import java.util.Scanner;

import java.util.*;

/**
 * Created by holyalchemist on 16/03/17.
 */
public class ReadFile {
    private Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("FishTime.txt"));

        }
        catch (Exception e) {
            System.out.println("Cant find the File");
        }
    }

    public void readFile() {
        while(x.hasNext()) {
            String a = x.next();
            //String b = x.next();
            //String c = x.next();

            System.out.printf("%s \n",a);
        }
    }

    public void closeFile() {
        x.close();
    }
}
