package com.letcode.two.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    private TwoSum twoSum = new TwoSumSolution();

    @Test
    void test() {
        //Given
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        //When
        int[] result = twoSum.twoSum(nums, target);

        //Then
        assertArrayEquals(expectedResult, result);
    }
}