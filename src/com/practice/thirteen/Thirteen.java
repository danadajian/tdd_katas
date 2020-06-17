package com.practice.thirteen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Thirteen {

    public long thirt(long n) {
        long lastNumber = -1;
        long currentNumber = 0;
        while (currentNumber != lastNumber) {
            lastNumber = currentNumber;
            currentNumber = processSequence(n);
            n = currentNumber;
        }
        return n;
    }

    public long linearCombination(List<Integer> integers, List<Integer> thirteenSequence) {
        return IntStream
                .range(0, integers.size())
                .map(i -> integers.get(i) * thirteenSequence.get(i))
                .sum();
    }

    public List<Integer> generateThirteenSequence(int n) {
        return IntStream
                .range(0, n)
                .map(i -> (int) (Math.pow(10, i) % 13))
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> getReverseOrderDigitList(long number) {
        String numString = String.valueOf(number);
        return IntStream
                .range(0, numString.length())
                .map(i -> numString.length() - i - 1)
                .map(i -> (int) numString.charAt(i) - '0')
                .boxed()
                .collect(Collectors.toList());
    }

    public long processSequence(long n) {
        List<Integer> reverseOrderDigitList = getReverseOrderDigitList(n);
        List<Integer> thirteenSequence = generateThirteenSequence(String.valueOf(n).length());
        return linearCombination(reverseOrderDigitList, thirteenSequence);
    }
}