package com.backstreetbrogrammer.part1_top75.Q6_MaximumProductSubarray;

import java.util.Arrays;

public class MaximumProductSubarray {

    public static void main(final String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(maxProduct(new int[]{-2, 0, -1}));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int maxProduct(final int[] nums) {
        if (nums.length == 1) return nums[0];

        int result = Arrays.stream(nums)
                           .max()
                           .getAsInt();

        int currMin = 1;
        int currMax = 1;

        for (final int num : nums) {
            final int tmp = currMax * num;
            currMax = Math.max(num * currMax, Math.max(num * currMin, num));
            currMin = Math.min(tmp, Math.min(num * currMin, num));
            result = Math.max(result, currMax);
        }

        return result;
    }
}
