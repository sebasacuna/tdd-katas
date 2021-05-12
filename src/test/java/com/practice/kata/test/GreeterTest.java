package com.practice.kata.test;

import com.practice.kata.fizzbuzz.FizzBuzz;
import com.practice.kata.greeter.Greeter;
import com.practice.kata.test.config.ReplaceGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Greeter Tests")
public class GreeterTest {

    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Nested
    @DisplayNameGeneration(ReplaceGenerator.ReplaceCamelCase.class)
    class greetMethod {

        @Test
        public void shouldReturnHelloName() throws Exception {

            String expected = "Hello Sebastian";

            String name = "Sebastian";

            String actual = Greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"Sebastian "," Sebastian"})
        public void shouldReturnTheResultTrim(String name) throws Exception {

            String expected = "Hello Sebastian";

            String actual = Greeter.greet(name);

            assertEquals(expected, actual);
        }

    }

}
