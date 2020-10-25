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
        /*
         the code will not compile, in consequence the test will fail that it is
         good because indicate that the feature not exist yet
        */
        final int arabic = convert("I");
        assertEquals(1,arabic);
    }

    private int convert(String i) {
        return 1;
    }

}
