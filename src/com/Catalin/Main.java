package com.Catalin;

public class Main {


    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    private static final String asdasdasdasd = "asda"; //Test, you can user lower case as well with no underscores.
    /** Constants are variables that you can not change the value of, once assigned, so it has a constant value.
     * "final" is used to make the variable final, this means that once the value is assigned to the variable it
     * can no longer be changed.
     * "static" if you want to use a variable that is being declared outside a method then it needs to be declared
     * static as well, just like a method.
     * Constants are typed in upper case so that they are easier to identify.
     * Using a constant makes it easier to avoid mistakes when typing the same string over and over.
     */

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-55));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
//            return "Invalid value!";
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours <10){
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if(remainingMinutes <10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds <10){
            secondsString = "0" + secondsString;
        }

//        return hours + "h " + minutes + "m " + seconds + "s";
        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
//            return "Invalid value!";
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = minutes % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}