package com.practice.digitalroot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {
    DigitalRoot digitalRoot = new DigitalRoot();

    @Test
    void shouldReturnSumOfDigitList() {
        assertEquals(7, digitalRoot.getDigitListSum(16));
        assertEquals(15, digitalRoot.getDigitListSum(456));
    }

    @Test
    void shouldReturnDigitalRoot() {
        assertEquals(7, digitalRoot.getDigitalRoot(16));
        assertEquals(6, digitalRoot.getDigitalRoot(456));
    }
}
