package com.backstreetbrogrammer.part1_top75.Q4_ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(final String[] args) {
        final int[] result = productExceptSelf(new int[]{1, 2, 3, 4});
        Arrays.stream(result).forEach(i -> System.out.printf("%d, ", i));

    }

    private static int[] productExceptSelf(final int[] nums) {
        final int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }

}
