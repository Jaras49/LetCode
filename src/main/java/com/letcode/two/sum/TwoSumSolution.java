package com.letcode.two.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int needed;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            needed = target - nums[i];
            if (map.containsKey(needed)) {
                result[0] = map.get(needed);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
