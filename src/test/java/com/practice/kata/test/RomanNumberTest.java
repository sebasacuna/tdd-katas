package com.practice.kata.test;

import com.practice.kata.RomanNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test()
    public void convertWrongRomanNumberToArabicNumber() {
        Assertions.assertThrows(Exception.class, () -> RomanNumber.convertToArabicNumber("L"));

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
        assertEquals(1, RomanNumber.convertToArabicNumber("V"));
        assertEquals(1, RomanNumber.convertToArabicNumber("X"));
        assertEquals(1, RomanNumber.convertToArabicNumber("V"));
        assertEquals(1, RomanNumber.convertToArabicNumber("X"));
        assertEquals(1, RomanNumber.convertToArabicNumber("L"));
        assertEquals(1, RomanNumber.convertToArabicNumber("C"));
        assertEquals(1, RomanNumber.convertToArabicNumber("D"));
        assertEquals(1, RomanNumber.convertToArabicNumber("M"));
    }



}
