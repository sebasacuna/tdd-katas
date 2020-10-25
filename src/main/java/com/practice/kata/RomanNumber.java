package com.practice.kata;

public class RomanNumber {

    public static int convertToArabicNumber(String romanNumber) throws Exception {
        if (romanNumber.equals("I")) {
            return 1;
        } else if (romanNumber.equals("V")) {
            return 5;
        } else if (romanNumber.equals("X")) {
            return 10;
        }
        else if (romanNumber.equals("II")) {
            return 2;
        }
        throw new  Exception("the number do not exist");
    }

}
