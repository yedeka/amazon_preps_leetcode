package com.gfg.gcl12.arrays_strings;
/*
* Solve the two sum problem on a sorted array
* */
public class TwoSumSorted {
    private static int[] twoSumSorted(int[] input, int target){
        int windowStart = 0, windowEnd = input.length-1, currentsum;
        while(windowEnd > windowStart){
            currentsum = input[windowEnd] + input[windowStart];
            if(currentsum < target) windowStart++;
            else if(currentsum > target) windowEnd --;
            else break;
        }
        return new int[]{windowStart, windowEnd};
    }
    public static void main(String[] args){
        int[] input = new int[]{2,6,9,11,13};
        int targetsum = 11;
        targetsum = 24;
        targetsum = 20;
        int[] targetSumIndices = twoSumSorted(input, targetsum);
        System.out.println("target sum indices => "+targetSumIndices[0]+" and "+targetSumIndices[1]);
    }
}
