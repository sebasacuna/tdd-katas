package com.practice.kata.greeter;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Greeter {

    private LocalTime time;

    public static String greet(String name){

        String finalName = name.trim();
        finalName = finalName.substring(0,1).toUpperCase().concat(finalName.substring(1,finalName.length()));

        return "Hello ".concat(finalName);
    }

}
