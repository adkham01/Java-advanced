package com.java.learning.arrays;

import java.util.*;


public class FindTheUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7, 7};
        
        optimal(arr1, arr2);
    }

    
    private static void brute(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        
        System.out.println(set);
        
    }
    
    private static void optimal(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
    
        int i = 0; 
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if(list.isEmpty() || list.getLast() != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if (list.isEmpty() || list.getLast() != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (list.isEmpty() || list.getLast() != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (list.isEmpty() || list.getLast() != arr2[i]) {
                list.add(arr2[i]);
            }
            j++;
        }
        System.out.println(list);
    
    }
    
}
