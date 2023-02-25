package com.backstreetbrogrammer.part1_top75.Q5_MaximumSubarray;

public class MaximumSubarray {

    public static void main(final String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    private static int maxSubArray(final int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (final int num : nums) {
            if (currSum < 0) currSum = 0;
            currSum += num;
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
