package com.practice.kata.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if (numberIsMultipleOfFive(number) && numberIsMultipleOfThree(number)) {
            return "FizzBuzz";
        }

        if (numberIsMultipleOfFive(number)) {
            return "Buzz";
        }

        if (numberIsMultipleOfThree(number)) {
            return "Fizz";
        }

        return "";
    }

    private static boolean numberIsMultipleOfThree(Integer number) {
        return (number % 3 == 0);
    }

    private static boolean numberIsMultipleOfFive(Integer number) {
        return (number % 5 == 0);
    }


}
