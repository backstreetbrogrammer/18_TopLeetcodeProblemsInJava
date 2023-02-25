package com.backstreetbrogrammer.part1_top75.Q1_TwoSum;

import java.util.HashMap;
import java.util.Map;

import static com.backstreetbrogrammer.PrintUtils.printIntArray;

public class TwoSum {

    public static void main(final String[] args) {
        printIntArray(twoSum(new int[]{2, 7, 11, 15}, 9));
        printIntArray(twoSum(new int[]{3, 2, 4}, 6));
        printIntArray(twoSum(new int[]{3, 3}, 6));
    }

    private static int[] twoSum(final int[] nums, final int target) {
        final int[] result = new int[2];
        final Map<Integer, Integer> numberIndex = new HashMap<>(); // Key: Number, Value: Index
        for (int i = 0; i < nums.length; i++) {
            final int diff = target - nums[i];
            if (numberIndex.containsKey(diff)) {
                result[0] = numberIndex.get(diff);
                result[1] = i;
                return result;
            }
            numberIndex.put(nums[i], i);
        }
        return result;
    }
}
