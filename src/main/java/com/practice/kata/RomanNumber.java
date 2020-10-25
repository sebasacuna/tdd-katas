package com.practice.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RomanNumber {

    public static int convertToArabicNumber(String romanNumber) throws Exception {
        if (romanNumber.length() == 1) {
            return convertSingleDigitToArabicNumber(romanNumber);
        } else if (romanNumber.length() > 1) {
            return operateDigit(romanNumber);
        }
        return 0;
    }

    public static int operateDigit(String romanNumber) throws Exception {
        LinkedList<String> separateRomanNumber = new LinkedList<String>(Arrays.asList(romanNumber.split("")));
        int arabicNumber = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        while (separateRomanNumber.size() != 0){
            firstNumber = 0;
            secondNumber = 0;
            if(separateRomanNumber.size() == 1){
                firstNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
                arabicNumber+= (firstNumber + secondNumber);
                break;
            }
            firstNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
            if(separateRomanNumber != null){
                secondNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
            }
            if (firstNumber >= secondNumber) {
                arabicNumber+= (firstNumber + secondNumber);
            }else {
                arabicNumber+= Math.abs(firstNumber - secondNumber);
            }
        }
        return arabicNumber;
    }

    private static boolean isValid(List<String> separateRomanNumber, int index) throws Exception {
        if ((index + 1 < separateRomanNumber.size())) {
            return true;
        } else {
            return false;
        }
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
