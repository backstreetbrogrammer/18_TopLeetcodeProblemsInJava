package com.backstreetbrogrammer.part1_top75.Q7_FindMinimumInRotatedSortedArray;

public class FindMinimumInRotatedSortedArray {

    public static void main(final String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
    }

    private static int findMin(final int[] nums) {
        int result = nums[0];
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                result = Math.min(nums[l], result);
                break;
            }
            final int mid = l + (r - l) / 2;
            result = Math.min(nums[mid], result);
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

}
