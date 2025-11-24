package com.java.learning.sorting;

import java.util.Arrays;
import java.util.Date;

public class SelectionSort {
    /*
     * Time Complexity: O(n^2) in any case
     * Space Complexity: O(1)
     * Stable: Yes
     * Modifier 'public' is redundant for 'main' method on Java 25
     */
    static void main() {
        int[] array = {13, 46, 24, 52, 20, 9, 47, 76, 3, 95, 32, 7, 53, 62, 85, 15};

        Date start = new Date();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        Date end = new Date();
        System.out.println("Elapsed time: " + (end.getTime() - start.getTime()) + " ms");
    }
}