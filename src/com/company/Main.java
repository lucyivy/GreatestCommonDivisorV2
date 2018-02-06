package com.company;

public class Main {

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor(16, 1028);
        System.out.println("Greatest common divisor of " + greatestCommonDivisor.getFirstInt() + " and " + greatestCommonDivisor.getSecondInt() + " is " + greatestCommonDivisor.getGCD());
    }
}
