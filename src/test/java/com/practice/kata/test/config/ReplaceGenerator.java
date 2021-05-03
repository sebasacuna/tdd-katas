package com.practice.kata.test.config;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class ReplaceGenerator {


    public ReplaceGenerator() {

    }

    public static class ReplaceCamelCase extends DisplayNameGenerator.Standard {

        public ReplaceCamelCase() {
        }

        public String generateDisplayNameForClass(Class<?> testClass) {
            return this.replaceCapitals(super.generateDisplayNameForClass(testClass));
        }

        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return this.replaceCapitals(super.generateDisplayNameForNestedClass(nestedClass));
        }

        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            return this.replaceCapitals(testMethod.getName());
        }

        private String replaceCapitals(String name) {
            name = name.replaceAll("([A-Z])", " $1");
            name = name.replaceAll("([0-9].)", " $1");
            return name;
        }
    }

}