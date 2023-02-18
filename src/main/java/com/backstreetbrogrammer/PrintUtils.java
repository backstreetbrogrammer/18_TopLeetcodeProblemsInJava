package com.backstreetbrogrammer;

public class PrintUtils {

    private PrintUtils() {
    }

    public static void printIntArray(final int[] array) {
        if (array == null || array.length == 0) return;
        for (final int ele : array) {
            System.out.printf("%d, ", ele);
        }
        System.out.println();
    }
}
