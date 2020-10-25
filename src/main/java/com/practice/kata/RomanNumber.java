package com.practice.kata;

public class RomanNumber {

    public static int convertToArabicNumber(String romanNumber) throws Exception {
        if (romanNumber.length() == 1) {
            switch (romanNumber) {
                case "I":
                    return 1;
                case "V":
                    return 5;
                case "X":
                    return 10;
                case "C":
                    return 100;
                case "D":
                    return 500;
                case "L":
                    return 50;
                case "M":
                    return 1000;
            }
        }
        if (romanNumber.equals("II")) {
            return 2;
        } else if (romanNumber.equals("III")) {
            return 3;
        } else if (romanNumber.equals("VI")) {
            return 6;
        }
        throw new Exception("the number do not exist");
    }

}
