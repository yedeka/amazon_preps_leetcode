package com.gfg.gcl12.arrays_strings;

import java.util.*;

/*
* Three sum problem is an extended version of 2 sum problem and it will be done in the time complexity of O(n^2).
* Here we are looking at the 2 pointers approach of 3 sum problem. This needs to array to be sorted.
* */
public class ThreeSum2PointersProblem {
    private static List<List<Integer>> threeSum(int[] input){
        if(null == input || input.length < 3){
            return null;
        }
        Arrays.sort(input);
        int currentNumber;
        List<List<Integer>> result = new ArrayList();

        for(int i=0;i<input.length-2;i++){
            currentNumber = input[i];
            // Condition to check for duplicates to be avoided since we are sorting the array duplicates will be adjecent to each other.
            if(i > 0 && currentNumber == input[i-1]) continue;
            twoSum(input, i, -currentNumber, result);
        }
        return result;
    }

    private static void twoSum(int[] input, int i, int targetSum, List<List<Integer>> result){
        int left = i+1, right = input.length -1, currenSum;
        while(left < right){
            currenSum = input[left] + input [right];
            if(currenSum > targetSum) right --;
            else if (currenSum < targetSum) left++;
            else{
                ArrayList<Integer> tripletsList = new ArrayList<Integer>();
                tripletsList.add(input[i]);
                tripletsList.add(input[left]);
                tripletsList.add(input[right]);
                result.add(tripletsList);
                left++;
            }
        }
    }

    public static void main(String[] arags){
        int[] input = new int[]{-1,0,1,2,-1,-4};
        threeSum(input);
    }
}
