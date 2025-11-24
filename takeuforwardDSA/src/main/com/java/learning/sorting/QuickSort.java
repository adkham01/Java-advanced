package com.java.learning.sorting;

import java.util.Arrays;
import java.util.Date;

public class QuickSort {

    /*
     * Time Complexity: O(n log n) worst case
     * Space Complexity: O(log n)
     * Stable: No
     * Modifier 'public' is redundant for 'main' method on Java 25
     */
    static void main() {
        int[] array = {13, 46, 24, 52, 20, 9, 47, 76, 3, 95, 32, 7, 53, 62, 85, 15};

        Date start = new Date();
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        Date end = new Date();
        System.out.println("Elapsed time: " + (end.getTime() - start.getTime()) + " m");
    }
    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low,high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }

    }
    static int  partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for(int j = low; j < high; j++) {
            if(array[j] <= pivot) {
                i++;
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}
