package org.example.humanReadableTime;

// Human Readable Time: https://www.codewars.com/kata/52685f7382004e774f0001f7

public class TimeConverter {
    public String makeReadable(int seconds) {
        StringBuilder readableTime = new StringBuilder();
        int minutes = 0;
        int hours = 0;
        if(seconds > 59) {
            minutes = seconds/60;
            seconds = seconds%60;
            if(minutes > 59) {
                hours = minutes/60;
                minutes = minutes%60;
            }
        }
        readableTime.append(getFormattedTimePart(hours) + ":");
        readableTime.append(getFormattedTimePart(minutes) + ":");
        readableTime.append(getFormattedTimePart(seconds));

        return String.valueOf(readableTime);
    }

    private String getFormattedTimePart(int timePart) {
        if (timePart < 10) {
            return "0" + timePart;
        }
        return String.valueOf(timePart);
    }
}
