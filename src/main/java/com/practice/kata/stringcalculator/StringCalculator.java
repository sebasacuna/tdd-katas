package com.practice.kata.stringcalculator;

public class StringCalculator {


    public Integer add(String operations){

        if(isEmpty(operations) ){
            return 0;
        }
        if(!isEmpty(operations)){
            return Integer.valueOf(operations);
        }

        return null;
    }

    public boolean isEmpty(String operations){
        return operations == null || operations.equals("");
    }

}
