package com.java.learning.arrays;

import java.util.*;

public class FindIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7, 7};
        optimal(arr1, arr2);
        brute(arr1, arr2);
    }

    private static void brute(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int[] vis = new int[arr2.length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j] && vis[j] == 0){
                    list.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i])
                break;
            }
        }
        System.out.println(list);
    }
    private static void optimal(int[] arrA, int[] arrB){
        List<Integer> list = new ArrayList<>();
        
        int i = 0; 
        int j = 0; 

        while (i < arrA.length && j < arrB.length) {
            if(arrA[i] < arrB[j]){
                i++;
            }
            else if (arrB[j] < arrA[i]) {
                j++;
            }
            else{
                list.add(arrA[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);
    }
}
