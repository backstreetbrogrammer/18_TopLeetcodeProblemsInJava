package com.backstreetbrogrammer.part1_top75.Q3_ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(final int[] nums) {
        if (nums.length == 1) return false;
        final Set<Integer> set = new HashSet<>();
        for (final int num :
                nums) {
            final boolean isNotAlreadyPresent = set.add(num);
            if (!isNotAlreadyPresent) {
                return true;
            }
        }

        return false;
    }
}
