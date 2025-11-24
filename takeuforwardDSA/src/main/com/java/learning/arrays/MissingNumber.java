package com.java.learning.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(best(nums));
    }

    
    
    
    private static int brute(int[] nums, int n) {
        
        for(int i = 1; i < n; i++){
            int flag = 0;
            for(int j = 0; j < n-1; j++){
                if(nums[j] == nums[i]){
                    flag = i;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
    
    private static int better(int[] nums, int n) {
        
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++){
            arr[nums[i]] = 1;
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
    
    private static int optimal(int[] nums, int n) { 
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return ((n*(n+1))/2 - sum);
    }

    private static int best(int[] nums) { 
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < nums.length-1; i++){ 
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ (nums.length-1);
        return (xor1 ^ xor2);
    }

}
