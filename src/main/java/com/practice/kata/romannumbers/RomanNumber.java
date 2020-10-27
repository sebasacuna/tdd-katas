package com.practice.kata.romannumbers;

import com.practice.kata.romannumbers.exceptions.RomanNumberDoNotExist;
import com.practice.kata.romannumbers.exceptions.RomanNumberOperationDoNotExist;

import java.util.Arrays;
import java.util.LinkedList;

public class RomanNumber {

    private RomanNumber() {
    }

    public static int convertToArabicNumber(String romanNumber) throws RomanNumberDoNotExist, RomanNumberOperationDoNotExist {
        if (romanNumber.length() == 1) {
            return convertSingleDigitToArabicNumber(romanNumber);
        } else if (romanNumber.length() > 1) {
            return operateDigit(romanNumber);
        }
        return 0;
    }

    public static int operateDigit(String romanNumber) throws RomanNumberDoNotExist, RomanNumberOperationDoNotExist {
        LinkedList<String> separateRomanNumber = romanNumberToLinkedList(romanNumber);
        int arabicNumber = 0;
        while (!separateRomanNumber.isEmpty()) {
            int firstNumber = 0;
            int secondNumber = 0;
            if (separateRomanNumber.size() == 1) {
                firstNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
                arabicNumber = operateArabicNumber(arabicNumber, firstNumber, secondNumber, "add");
                break;
            }
            firstNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
            if (!separateRomanNumber.isEmpty()) {
                secondNumber = convertSingleDigitToArabicNumber(separateRomanNumber.pop());
            }
            if (firstNumber >= secondNumber) {
                arabicNumber = operateArabicNumber(arabicNumber, firstNumber, secondNumber, "add");
            } else {
                arabicNumber = operateArabicNumber(arabicNumber, firstNumber, secondNumber, "subtract");
            }
        }
        return arabicNumber;
    }

    private static LinkedList<String> romanNumberToLinkedList(String romanNumber) {
        return new LinkedList<>(Arrays.asList(romanNumber.split("")));
    }

    private static int operateArabicNumber(int arabicNumber, int firstNumber, int secondNumber, String operation) throws RomanNumberOperationDoNotExist {
        switch (operation) {
            case "add":
                arabicNumber += (firstNumber + secondNumber);
                break;
            case "subtract":
                arabicNumber += Math.abs(firstNumber - secondNumber);
                break;
            default:
                throw new RomanNumberOperationDoNotExist();
        }
        return arabicNumber;
    }

    private static int convertSingleDigitToArabicNumber(String romanNumber) throws RomanNumberDoNotExist {
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
            default:
                throw new RomanNumberDoNotExist();
        }

    }

}
