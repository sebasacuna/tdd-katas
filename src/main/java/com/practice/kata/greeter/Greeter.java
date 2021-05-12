package com.practice.kata.greeter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Greeter {

    private LocalTime time;

    public static String greet(String name){

        String finalName = name.trim();
        finalName = finalName.substring(0,1).toUpperCase().concat(finalName.substring(1,finalName.length()));

        return "Hello ".concat(finalName);
    }

    private static String upperCaseFirstLetter(String name){

        String firstLetterWithUpperCase = name.substring(0,1).toUpperCase();

        String nameWithOutFirstLetter = name.substring(1,name.length());

        return firstLetterWithUpperCase.concat(nameWithOutFirstLetter);
    }

}
