package com.java.learning.arrays;

import java.util.*;

public class FindAppears {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(brute(nums));
    }

    private static int brute(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int flag = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    flag++;
                }
            }
            if(flag == 1){
                return nums[i];
            }
            
        }
        return -1;
    }

    private static int better(int[] nums){
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
        
    }

    private static int optimal(int[] nums){
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];
        }

        return xor;
    }
}

