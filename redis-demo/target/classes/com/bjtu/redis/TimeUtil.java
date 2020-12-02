package com.bjtu.redis;

public class TimeUtil {
    private TimeUtil(){
    }

    public static int dayToSeconds(int day){
        return day * 24 * 60 * 60;
    }

    public static int hourToSeconds(int hour){
        return hour * 60 * 60;
    }

    public static int minuteToSeconds(int minute){
        return minute * 60;
    }
}
