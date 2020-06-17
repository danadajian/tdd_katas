package com.practice.digitalroot;

import java.util.stream.IntStream;

public class DigitalRoot {

    public int getDigitalRoot(int number) {
        int digitalRoot = getDigitListSum(number);
        while (digitalRoot >= 10) {
            digitalRoot = getDigitListSum(digitalRoot);
        }
        return digitalRoot;
    }

    public int getDigitListSum(int number) {
        String numString = String.valueOf(number);
        return IntStream
                .range(0, numString.length())
                .map(i -> numString.charAt(i) - '0')
                .sum();
    }
}