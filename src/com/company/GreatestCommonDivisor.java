package com.company;

public class GreatestCommonDivisor {
    private Integer firstInt;
    private Integer secondInt;

    public GreatestCommonDivisor(Integer firstInt, Integer secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public Integer getGCD() {
        Integer gcd;
        while (firstInt % secondInt != 0) {
            if (firstInt > secondInt) {
                firstInt -= secondInt;
            } else {
                secondInt -= firstInt;
            }
        }
        gcd = secondInt;
        return gcd;
    }

    public Integer getFirstInt() {
        return firstInt;
    }

    public Integer getSecondInt() {
        return secondInt;
    }
}
