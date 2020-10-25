package com.practice.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumber {

    public static int convertToArabicNumber(String romanNumber) throws Exception {
        if (romanNumber.length() == 1) {
            return convertSingleDigitToArabicNumber(romanNumber);
        } else if (romanNumber.length() > 1) {
            return additionDigits(romanNumber);
        }
        throw new Exception("the number do not exist");
    }

    public static int additionDigits(String romanNumber) throws Exception {
        List<String> separateRomanNumber = new ArrayList<String>(Arrays.asList(romanNumber.split("")));
        int arabicNumber = 0;
        int sum = 0;
        for (int index = 0; index < separateRomanNumber.size(); index++) {
            arabicNumber += convertSingleDigitToArabicNumber(separateRomanNumber.get(index));;
        }
        return arabicNumber;
    }

    private static int convertSingleDigitToArabicNumber(String romanNumber) throws Exception {
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
        throw new Exception("the number do not exist");
    }

}
