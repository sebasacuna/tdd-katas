package com.practice.kata.test;

import com.practice.kata.stringcalculator.StringCalculator;
import com.practice.kata.test.config.ReplaceGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Roman Number Tests")
public class StringCalculatorTest {

    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Nested
    @DisplayNameGeneration(ReplaceGenerator.ReplaceCamelCase.class)
    class AddMethod {

        @Test
        public void shouldReturnTheSumOfTwoNumbers() throws Exception {

            Integer expected = 0;

            StringCalculator stringCalculator = new StringCalculator();

            Integer actual = stringCalculator.add("");

            assertEquals(expected, actual);
        }


    }


}
