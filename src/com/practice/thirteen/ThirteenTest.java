package com.practice.thirteen;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThirteenTest {
    Thirteen thirteen = new Thirteen();
    List<Integer> thirteenSequence = Arrays.asList(1, 10, 9, 12, 3, 4);

    @Test
    void shouldProduceLinearCombination() {
        long result = thirteen.linearCombination(Arrays.asList(6, 5, 4, 3, 2, 1), thirteenSequence);
        assertEquals(6 + 5*10 + 4*9 + 3*12 + 2*3 + 4, result);
    }

    @Test
    void shouldProduceAnNSizedThirteenSequence() {
        List<Integer> result = thirteen.generateThirteenSequence(5);
        assertEquals(Arrays.asList(1, 10, 9, 12, 3), result);
    }

    @Test
    void shouldProduceAnIntegerListOfDigitsInReverseOrder() {
        List<Integer> result = thirteen.getReverseOrderDigitList(90210);
        assertEquals(Arrays.asList(0, 1, 2, 0, 9), result);
    }

    @Test
    void shouldProcessSequence() {
        long result = thirteen.processSequence(1234567);
        assertEquals(178, result);
    }

    @Test
    void shouldProduceStationaryNumber() {
        assertEquals(87, thirteen.thirt(1234567));
        assertEquals(48, thirteen.thirt(321));
        assertEquals(79, thirteen.thirt(8529));
        assertEquals(31, thirteen.thirt(85299258));
        assertEquals(57, thirteen.thirt(5634));
        assertEquals(71, thirteen.thirt(1111111111));
        assertEquals(30, thirteen.thirt(987654321));
    }
}
