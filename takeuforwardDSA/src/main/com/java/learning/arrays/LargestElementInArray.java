package com.java.learning.arrays;

import java.util.Arrays;

public class LargestElementInArray {

    private int[] array ={3, 2, 1, 5, 6, 4};;

    public int brute(){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public int better(){        
        for(int i = 1; i < array.length; i++){
            if(array[i-1] > array[i]){
                int temp = array[i-1];
                array[i-1] = array[i];
                array[i] = temp;
            }
        }
        return array[array.length-1];
    }
    public int optimized(){
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }
}
