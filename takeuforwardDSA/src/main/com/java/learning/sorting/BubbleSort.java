package com.java.learning.sorting;

import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

    /*
     * Time Complexity: O(n^2) worst case
     * Best Case: O(n) when array is sorted in ascending order
     * Space Complexity: O(1)
     * Stable: Yes
     */
    static void main() {
        int[] array = {13, 46, 24, 52, 20, 9, 47, 76, 3, 95, 32, 7, 53, 62, 85, 15};

        Date start = new Date();
        for (int i = array.length-1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
        Date end = new Date();
        System.out.println("Elapsed time: " + (end.getTime() - start.getTime()) + " ms");
    }
}
