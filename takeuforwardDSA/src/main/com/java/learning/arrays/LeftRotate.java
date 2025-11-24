package com.java.learning.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        for(int i :optimized(array, array.length,  3)){
            System.out.print(i+"\t");
        }
    }

    public static int[] brute(){
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static int[] better(int[] nums, int n, int d){
        int[] arr = new int[d];
        for(int i = 0; i < d; i++){
            arr[i] = nums[i];
        }

        for(int i = d; i < n; i++){
            nums[i - d] = nums[i];
        }

        for(int i = n-d; i < n; i++){
            nums[i] = arr[i - (n-d)];
        }
        
        return nums;
    }
    public static int[] optimized(int [] arr, int n, int d){

        for(int i = 0; i < d; i++){
            revere(arr, n);
        }
        return arr;
    }

    private static int[] revere(int[] arr, int n){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
}
