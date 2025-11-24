package com.java.learning.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(optimal(array, 4));

    }

    public static int brute1(int[] array, int k){
        int n = array.length;

        int len = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int m = i; m <= j; m++){
                    sum += array[m];
                }
                if(sum == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
    public static  int brute2(int[] array, int k){
        int n = array.length;
        
        int len = 0;
        for(int i = 0; i< n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += array[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
    
    public static int better(int[] array, int k){
        int n = array.length;

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }

        }

        return maxLen;
    }
    public static int optimal(int[] array, int k){
        int n = array.length;

        int left = 0;
        int right = 0;
        long sum = array[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= array[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;

            if(right < n){
                sum += array[right];
            }
        }
        return maxLen;
    }
}