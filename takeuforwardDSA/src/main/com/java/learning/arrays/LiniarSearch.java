package com.java.learning.arrays;

public class LiniarSearch {
    public static void main(String[] args) {
        brute(new int[]{2, 1, 6, 9, 32}, 32);    
    }

    private static void brute(int[] array, int n){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
