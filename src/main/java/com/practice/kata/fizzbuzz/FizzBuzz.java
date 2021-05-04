package com.practice.kata.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(Integer number){
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        return "";
    }

}
