package com.ki113d.chatbot.util;

import java.util.*;

/**
 * A basic utility class containing functions for the bot to utilize.
 * @author Ki113d
 */
public class BasicUtils {

    private int ONE_MINUTE = 60 * 1000;
    private int ONE_HOUR = 60 * ONE_MINUTE;
    private int ONE_DAY = 24 * ONE_HOUR;

    /**
     * Returns the bots current local time.
     * 
     * @return A string representing the bots current local time.
     */
    public String getTime() {
        String Minute, Second;
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeZone(null);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // If minute is between 0 and 10 add a 0 to the front.
        if (minute < 10) Minute = "0" + minute;
        else Minute = Integer.toString(minute);

        // If second is between 0 and 10 add a 0 to the front.
        if (second < 10) Second = "0" + second;
        else Second = Integer.toString(second);

        return (hour + ":" + minute + "." + second + " " +
               (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
    }

    /**
     * Returns the time regarding an integer based offset.
     * For example to find the time for UTC +10 you would call this method as
     * <p>such {@code getTime(10);} or even {@code getTime(-10);}</p>
     * 
     * @param offset An integer representing a timezone offset.
     * @return A string representing the time.
     */
    public String getTime(int offset) {
        String Minute, Second;
        Calendar calendar = new GregorianCalendar();
        TimeZone tz = calendar.getTimeZone();

        tz.setRawOffset(offset * ONE_HOUR);
        calendar.setTimeZone(tz);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // If minute is between 0 and 10 add a 0 to the front.
        if (minute < 10) Minute = "0" + minute;
        else Minute = Integer.toString(minute);

        // If second is between 0 and 10 add a 0 to the front.
        if (second < 10) Second = "0" + second;
        else Second = Integer.toString(second);
        
        return (hour + ":" + Minute + "." + Second + " " +
               (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
    }
}
