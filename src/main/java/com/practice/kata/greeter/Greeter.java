package com.practice.kata.greeter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Greeter {

    private LocalTime time;

    public String greet(String name){

        String finalName = name.trim();
        finalName = finalName.substring(0,1).toUpperCase().concat(finalName.substring(1,finalName.length()));

        if(this.time.isAfter(LocalTime.of(6,0)) && this.time.isBefore(LocalTime.of(12,0))){
            return "Good Morning ".concat(finalName);
        }

        return "Hello ".concat(finalName);
    }

    private String upperCaseFirstLetter(String name){

        String firstLetterWithUpperCase = name.substring(0,1).toUpperCase();

        String nameWithOutFirstLetter = name.substring(1,name.length());

        return firstLetterWithUpperCase.concat(nameWithOutFirstLetter);
    }

}
