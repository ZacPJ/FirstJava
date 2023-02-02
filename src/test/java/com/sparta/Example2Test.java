package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {
    @Test
    @DisplayName("My First Test")
    public void firstTest(){
        assertTrue(5 == 5);
    }
    @Test
    @DisplayName("Given a time of 21, greeting returns Good Evening")
    public void given21_Greeting_ReturnsGoodEvening(){
        int time = 21;
        String expectedGreeting = "Good Evening!";
        String result = Example2.greeting(time);
        assertEquals(expectedGreeting,result);
    }
    @Test
    @DisplayName("Given a time of 12, greeting returns Good Morning")
    public void  given12_Greeting_ReturnsGoodMorning() {
        int time = 12;
        String expectedGreeting = "Good Morning!";
        String result = Example2.greeting(time);
        assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Given a time of 5, greeting returns Good Morning")
    public void  given5_Greeting_ReturnsGoodMorning() {
        int time = 5;
        String expectedGreeting = "Good Morning!";
        String result = Example2.greeting(time);
        assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Given a time of 13, greeting returns Good Morning")
    public void  given13_Greeting_ReturnsGoodMorning() {
        int time = 13;
        String expectedGreeting = "Good Afternoon!";
        String result = Example2.greeting(time);
        assertEquals(expectedGreeting, result);
    }
    @ParameterizedTest
    @ValueSource(ints = {5,6,7,8,9,10,11,12})
    @DisplayName("Given a time between 5 and 12, greeting returns Good Morning")
    public void GivenTimeBetween5And12_Greeting_ReturnsGoodMorning(int time){
        String expected = "Good Morning!";
        String result = Example2.greeting(time);
        assertEquals(expected,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {13,14,15,16,17,18})
    @DisplayName("Given a time between 13 and 18, greeting returns Good Afternoon")
    public void GivenTimeBetween13And18_Greeting_ReturnsGoodAfternoon(int time){
        String expected = "Good Afternoon!";
        String result = Example2.greeting(time);
        assertEquals(expected,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {19,20,21,22,23,24,0,1,2,3,4})
    @DisplayName("Given a time between 19 and 4, greeting returns Good Evening")
    public void GivenTimeBetween19And4_Greeting_ReturnsGoodAfternoon(int time){
        String expected = "Good Evening!";
        String result = Example2.greeting(time);
        assertEquals(expected,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {-1,-10000000,25,10000000})
    @DisplayName("Given a time outside the range, greeting returns Please enter a valid time")
    public void GivenTimeOutsideTheRange_Greeting_Returns_EnterValidNumber(int time){
        String expected = "Please enter a valid time";
        String result = Example2.greeting(time);
        assertEquals(expected,result);
    }
}