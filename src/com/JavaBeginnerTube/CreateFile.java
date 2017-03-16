package com.JavaBeginnerTube;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 * Created by holyalchemist on 16/03/17.
 */
public class CreateFile {
    private Formatter x;

    public void openFile() {
        try {
            x = new Formatter("FishTime.txt");
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }

    public void addRecords () {
        x.format("%s%s%s", "20", "Fish", "Time");
    }

    public void closeFile() {
        x.close();
    }
}
