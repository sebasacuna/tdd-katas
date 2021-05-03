package com.practice.kata.test;

import com.practice.kata.test.config.ReplaceGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Fizz and Buzz Test")
public class FizzBuzzTest {

    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Nested
    @DisplayNameGeneration(ReplaceGenerator.ReplaceCamelCase.class)
    class FizzBuzzMethod {

        @ParameterizedTest
        @ValueSource(ints = {})
        public void shouldReturnFizzIfNumberIsMultipleOfThree(Integer number) throws Exception {

            String expected = "Fizz";

            String actual = FizzBuzz.fizzBuzz();

            assertEquals(expected, actual);
        }

    }

}
