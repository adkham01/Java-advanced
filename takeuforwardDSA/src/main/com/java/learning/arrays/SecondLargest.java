package com.java.learning.arrays;

import java.util.Arrays;

public class SecondLargest {

    
    public int brute(){
        int[] array ={1, 2, 4, 7, 7, 5, 6, 6, 8, 3};

        Arrays.sort(array);
        int secondLargest = -1;
        for(int i = array.length - 2; i >= 0; i--){
            if (array[i] != array[array.length - 1]) {
                secondLargest = array[i];
                break;
            }
        }
        return secondLargest;
    }

    public int better(){
        int[] array ={1, 2, 4, 7, 7, 5, 6, 6, 8, 3};

        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (i > largest) {
                largest = i;
            }
        }
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < largest && array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public int optimized(){
        int[] array ={1, 2, 4, 7, 7, 5, 6, 6, 8, 3};

        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 1; i < array.length; i++){
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }else if(array[i] < largest && array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public int[] secondLargestAndSmallest(){
        int[] result = new int[2];
        int[] array ={1, 2, 4, 7, 7, 5, 6, 6, 8, 3};

        result[0] = sSmallest(array);
        result[1] = slargrst(array);

        return result;
    }

    private int sSmallest(int[] array){
        int smallest = array[0];
        int ikki = Integer.MAX_VALUE;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                ikki = smallest;
                smallest = array[i];
            }
            else if(array[i] != smallest && array[i] < ikki){
                ikki = array[i];
            }
        }

        return ikki;
    }

    private int slargrst(int[] array){
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }
        }
        return secondLargest;
    }
    
}
