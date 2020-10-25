package com.practice.kata.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanNumberTest {

    @Test
    public void junitWorks(){
        assertTrue(true);
    }

    @Test
    public void convertSingleDigitRoman(){
        final int arabicNumber = convert("I");
        assertEquals(1,arabicNumber);
    }

    private static int convert(String romanNumber) {
        return 1;
    }

}
