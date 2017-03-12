package com.JavaBeginnerTube;

/**
 * Created by holyalchemist on 12/03/17.
 */
public class FishTime {
    private int hour;
    private int minute;
    private int second;

    public FishTime () {

    }



    public void setTime(int h, int m, int s) {
        hour = ((h>=0 && h<=24)?h:0);
        minute = ((m>=0 && m<=60)?m:0);
        second = ((s>=0 && s<=60)?s:0);
    }

    public String toMill() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour<12?"AM":"PM"));

    }
}
