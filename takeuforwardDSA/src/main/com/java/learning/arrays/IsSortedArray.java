package com.java.learning.arrays;

public class IsSortedArray{
    public boolean brute(int[] array){
        boolean respone = false;
        int prevous = array[0];
        for(int i = 1; i< array.length; i++){
            if(prevous <= array[i]){
                respone = true;
                prevous = array[i];
            }else{
                return false;
            }
        }
        return respone;

    }
}