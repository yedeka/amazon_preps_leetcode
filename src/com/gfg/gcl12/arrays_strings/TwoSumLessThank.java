package com.gfg.gcl12.arrays_strings;

import java.util.Arrays;

public class TwoSumLessThank {
    private static int findTwoSumLessThank(int[] nums, int k){
        if(null == nums || nums.length < 2){
            return -1;
        }
        Arrays.sort(nums);
        int sum = -1, currentSum, windowStart = 0, windowEnd = nums.length - 1;
        while(windowEnd > windowStart){
            currentSum = nums[windowStart] + nums[windowEnd];
            if(currentSum < k){
                sum = Math.max(sum, currentSum);
                windowStart++;
            }else{
                windowEnd --;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] input = new int[] {34,23,1,24,75,33,54,8};
        int k = 60;
        input = new int[] {10, 20, 30};
        k = 15;
        int maxTwoSum = findTwoSumLessThank(input, k);
        System.out.println("MAX two sum => "+maxTwoSum);
    }
}
