package com.practice.kata.greeter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

import static com.practice.kata.greeter.Constants.*;

@Data
@AllArgsConstructor
public class Greeter {

    private LocalTime time;

    public String greet(String name) {

        String finalName = name.trim();
        finalName = upperCaseFirstLetter(finalName);

        if (itsMorning(this.time)) {
            return "Good Morning ".concat(finalName);
        }

        if (itsEvening(this.time)){
            return "Good Evening ".concat(finalName);
        }

        return "Hello ".concat(finalName);
    }

    private boolean itsEvening(LocalTime time) {

        LocalTime eveningStart = LocalTime.of(EIGHTEEN_HOUR, ZERO_MINUTES);

        LocalTime eveningEnds = LocalTime.of(TWENYTWO_HOUR, ZERO_MINUTES);

        return time.isAfter(eveningStart) && time.isBefore(eveningEnds);

    }

    private boolean itsMorning(LocalTime time) {

        LocalTime morningStart = LocalTime.of(SIX_HOUR, ZERO_MINUTES);

        LocalTime morningEnds = LocalTime.of(TWELVE_HOUR, ZERO_MINUTES);

        return time.isAfter(morningStart) && time.isBefore(morningEnds);
    }

    private String upperCaseFirstLetter(String name) {

        String firstLetterWithUpperCase = name.substring(0, 1).toUpperCase();

        String nameWithOutFirstLetter = name.substring(1, name.length());

        return firstLetterWithUpperCase.concat(nameWithOutFirstLetter);
    }

}
