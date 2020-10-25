package com.practice.kata.test;

import com.practice.kata.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumberTest {

    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Test
    public void convertOneRomanNumberToArabicNumber() {
        final int arabicNumber = RomanNumber.convertToArabicNumber("I");
        assertEquals(1, arabicNumber);
    }

    @Test
    public void convertFiveRomanNumberToArabicNumber() {
        final int arabicNumber = RomanNumber.convertToArabicNumber("V");
        assertEquals(5, arabicNumber);
    }

}
