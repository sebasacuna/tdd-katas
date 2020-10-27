package com.practice.kata.test;

import com.practice.kata.romannumbers.RomanNumber;
import com.practice.kata.romannumbers.exceptions.RomanNumberDoNotExist;
import com.practice.kata.romannumbers.exceptions.RomanNumberOperationDoNotExist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumberTest {


    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Test
    public void convertOneRomanNumberToArabicNumber() throws Exception {
        assertEquals(1, RomanNumber.convertToArabicNumber("I"));
    }

    @Test
    public void convertFiveRomanNumberToArabicNumber() throws Exception {
        assertEquals(5, RomanNumber.convertToArabicNumber("V"));
    }

    @Test
    public void convertTenRomanNumberToArabicNumber() throws Exception {
        assertEquals(10, RomanNumber.convertToArabicNumber("X"));
    }

    @Test
    public void convertSixRomanNumberToArabicNumber() throws Exception {
        assertEquals(6, RomanNumber.convertToArabicNumber("VI"));
    }

    @Test()
    public void convertWrongRomanNumberToArabicNumber() {
        assertThrows(Exception.class, () -> RomanNumber.convertToArabicNumber("U"));

    }

    @Test()
    public void romanNumeralAddition() throws Exception {
        assertEquals(2, RomanNumber.convertToArabicNumber("II"));
        assertEquals(3, RomanNumber.convertToArabicNumber("III"));
        assertEquals(6, RomanNumber.convertToArabicNumber("VI"));
    }

    @Test()
    public void convertRomanNumbersWithOneDigits() throws Exception {
        assertEquals(1, RomanNumber.convertToArabicNumber("I"));
        assertEquals(5, RomanNumber.convertToArabicNumber("V"));
        assertEquals(100, RomanNumber.convertToArabicNumber("C"));
        assertEquals(500, RomanNumber.convertToArabicNumber("D"));
        assertEquals(50, RomanNumber.convertToArabicNumber("L"));
        assertEquals(1000, RomanNumber.convertToArabicNumber("M"));
        assertEquals(10, RomanNumber.convertToArabicNumber("X"));
    }

    @Test()
    public void convertStringToArrayDigits() throws Exception {
        assertEquals(2, RomanNumber.operateDigit("II"));
        assertEquals(3, RomanNumber.operateDigit("III"));
        assertEquals(8, RomanNumber.operateDigit("VIII"));
    }

    @Test()
    public void operateRomanDigitsToForceSubtractOperation() throws Exception {
        assertEquals(4, RomanNumber.operateDigit("IV"));
        assertEquals(9, RomanNumber.operateDigit("IX"));
    }

    @Test()
    public void operateComplexRomanNumbers() throws Exception {
        assertEquals(40, RomanNumber.operateDigit("XL"));
        assertEquals(27, RomanNumber.operateDigit("XXVII"));
        assertEquals(49, RomanNumber.operateDigit("XLIX"));
        assertEquals(65, RomanNumber.operateDigit("LXV"));
        assertEquals(24, RomanNumber.operateDigit("XXIV"));
        assertEquals(24, RomanNumber.operateDigit("XXIV"));
        assertEquals(24, RomanNumber.operateDigit("XXIV"));
        assertEquals(38, RomanNumber.operateDigit("XXXVIII"));
    }

    @Test()
    public void forceThrowRomanNumberOperationDoNotExist() {

        Exception exception = assertThrows(RomanNumberOperationDoNotExist.class, () -> {
            RomanNumber.operateArabicNumber(0, 1, 2, "BAD_OPERATION");
        });

        String expectedMessage = "operation do not exist";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test()
    public void convertSingleDigitToArabicNumber()  {

        Exception exception = assertThrows(RomanNumberDoNotExist.class, () -> {
            RomanNumber.convertSingleDigitToArabicNumber("P");
        });

        String expectedMessage = "the number do not exist";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
