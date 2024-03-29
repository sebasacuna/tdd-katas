package com.practice.kata.test;

import com.practice.kata.greeter.Greeter;
import com.practice.kata.test.config.ReplaceGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalTime;

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

            Greeter greeter = new Greeter(LocalTime.of(18, 0));

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"Sebastian ", " Sebastian"})
        public void shouldReturnTheResultTrim(String name) throws Exception {

            String expected = "Hello Sebastian";

            Greeter greeter = new Greeter(LocalTime.of(18, 0));

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"sebastian ", " nicolas"})
        public void shouldReturnTheResultWithTheFirstLetterCapitalizes(String name) throws Exception {

            name = name.trim();

            name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));

            String expected = "Hello ".concat(name);

            Greeter greeter = new Greeter(LocalTime.of(18, 0));

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"sebastian ", " nicolas"})
        public void shouldReturnGoodMorningNameWhenItsSixToTwelve(String name) throws Exception {

            name = name.trim();

            name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));

            Greeter greeter = new Greeter(LocalTime.of(7, 30));

            String expected = "Good Morning ".concat(name);

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"sebastian ", " nicolas"})
        public void shouldReturnGoodEveningNameWhenItsEighteenToTwenytwo(String name) throws Exception {

            name = name.trim();

            name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));

            Greeter greeter = new Greeter(LocalTime.of(19, 30));

            String expected = "Good Evening ".concat(name);

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"sebastian ", " nicolas"})
        public void shouldReturnGoodNightNameWhenItsTwenytwoToSix(String name) throws Exception {

            name = name.trim();

            name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));

            Greeter greeter = new Greeter(LocalTime.of(23, 30));

            String expected = "Good Night ".concat(name);

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

        @ParameterizedTest(name = "For example, name {0} ")
        @ValueSource(strings = {"sebastian ", " nicolas"})
        public void shouldReturnGoodNightNameWhenItsOneAm(String name) throws Exception {

            name = name.trim();

            name = name.substring(0, 1).toUpperCase().concat(name.substring(1, name.length()));

            Greeter greeter = new Greeter(LocalTime.of(1, 0));

            String expected = "Good Night ".concat(name);

            String actual = greeter.greet(name);

            assertEquals(expected, actual);
        }

    }

}
