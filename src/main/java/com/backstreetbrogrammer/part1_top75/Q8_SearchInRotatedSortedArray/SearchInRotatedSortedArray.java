package com.backstreetbrogrammer.part1_top75.Q8_SearchInRotatedSortedArray;

public class SearchInRotatedSortedArray {

    public static void main(final String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    private static int search(final int[] nums, final int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            final int mid = l + (r - l) / 2;
            if (target == nums[mid]) return mid;

            if (nums[l] <= nums[mid]) { // left portion
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else { // right portion
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1; // not found
    }

}
