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
        final int arabicNumber = RomanNumber.convertToArabicNumber("I");
        assertEquals(1, arabicNumber);
    }

    @Test
    public void convertFiveRomanNumberToArabicNumber() throws Exception {
        final int arabicNumber = RomanNumber.convertToArabicNumber("V");
        assertEquals(5, arabicNumber);
    }

    @Test
    public void convertTenRomanNumberToArabicNumber() throws Exception {
        final int arabicNumber = RomanNumber.convertToArabicNumber("X");
        assertEquals(5, arabicNumber);
    }

    @Test()
    public void convertWrongRomanNumberToArabicNumber() {
        Assertions.assertThrows(Exception.class, () -> {
            RomanNumber.convertToArabicNumber("L");
        });
    }

}
