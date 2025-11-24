package com.java.learning.arrays;

import java.util.Set;
import java.util.HashSet;


public class RemoveDuplicates {
    public int brute(int[] array){
        Set<Integer> response = new HashSet<>();
        for(int i = 1; i < array.length; i++){
            response.add(array[i]);
        }
        int cnt = 0;
        for (int in : response) {
            ++cnt;
            System.out.print(in + "\t");
        }
        System.out.println();
        return cnt;
    }

    public int optimized(int[] array){
        int cnt = 0;
        for(int i = 1; i < array.length; i++){
            if (array[cnt] != array[i]) {
                array[cnt + 1] = array[i];
                cnt++;
            }
        }
        return cnt+1;
    }
}
