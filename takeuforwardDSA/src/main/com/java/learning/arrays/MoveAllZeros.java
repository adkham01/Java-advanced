package com.java.learning.arrays;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] array = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        MoveAllZeros allZeros = new MoveAllZeros();
        allZeros.optimal(array);
        // allZeros.brute(array);

    }

    private void brute(int[] array) {
        int[] arr = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            } else {
                arr[j] = array[i];
                j++;
            }
        }
        array = arr;
    }

    private void optimal(int[] nums) {
        int j = -1;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        
        for(int i = j+1; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
