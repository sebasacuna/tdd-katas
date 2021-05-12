package com.practice.kata.greeter;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Greeter {

    private LocalTime time;

    public static String greet(String name){
        return "Hello ".concat(name);
    }

}
