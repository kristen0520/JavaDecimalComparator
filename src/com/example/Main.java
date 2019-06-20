package com.example;

public class Main {

    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo){
        valueOne = valueOne * 1000;
        valueTwo = valueTwo * 1000;
        long longOne = (long) valueOne;
        long longTwo = (long) valueTwo;

        if(longOne == longTwo){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	    areEqualByThreeDecimalPlaces(1.221, 1.222);
    }
}
