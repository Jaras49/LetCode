package com.letcode.reverse.integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerSolutionTest {

    private ReverseInteger reverseInteger = new ReverseIntegerSolution();

    @Test
    void shouldReturnReversed() {
        //when
        int reversed = reverseInteger.reverse(87654321);

        //then
        assertEquals(12345678, reversed);
    }

    @Test
    void shouldReturn0() {
        //when
        int reversed = reverseInteger.reverse(1234567899);

        //then
        assertEquals(0, reversed);
    }
}