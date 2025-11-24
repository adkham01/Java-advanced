package com.java.learning.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MergeSort {

    /*
     * Time Complexity: O(n log n) worst case
     * Space Complexity: O(n)
     * Stable: Yes
     * Modifier 'public' is redundant for 'main' method on Java 25
     */
    static void main() {
        int[] array = {13, 46, 24, 52, 20, 9, 47, 76, 3, 95, 32, 7, 53, 62, 85, 15};

        Date start = new Date();
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        Date end = new Date();
        System.out.println("Elapsed time: " + (end.getTime() - start.getTime()) + " m");

    }

    static void mergeSort(int[] array, int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);

    }
    static void merge(int[] array, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid+1;
        while(i <= mid && j <= high) {
            if(array[i] <= array[j]) {
                list.add(array[i]);
                i++;
            } else {
                list.add(array[j]);
                j++;
            }
        }
        while(i <= mid) {
            list.add(array[i]);
            i++;
        }
        while(j <= high) {
            list.add(array[j]);
            j++;
        }
        for(int k = low; k <= high; k++) {
            array[k] = list.get(k-low);
        }
    }
}
