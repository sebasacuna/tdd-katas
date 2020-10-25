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
        Assertions.assertThrows(Exception.class, () -> RomanNumber.convertToArabicNumber("L") );

    }

}
