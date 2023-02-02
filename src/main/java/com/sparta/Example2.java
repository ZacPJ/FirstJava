package com.sparta;

public class Example2 {
    public static void main(String[] args){
        int timeOfDay = 12;
        System.out.println(greeting(timeOfDay));
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if(timeOfDay >= 5 && timeOfDay <= 12){
            greeting = "Good Morning!";
        } else if (timeOfDay >= 13 && timeOfDay <= 18) {
            greeting = "Good Afternoon!";
        } else if (timeOfDay < 0 || timeOfDay > 24){
            greeting = "Please enter a valid time";
        }
        else{
            greeting = "Good Evening!";
        }
        return greeting;
    }
}
