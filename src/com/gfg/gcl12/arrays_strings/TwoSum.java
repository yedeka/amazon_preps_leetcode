package com.gfg.gcl12.arrays_strings;

import java.util.HashMap;

/*
* Given an array of integers and a target sum return indices of two numbers such that they add up to the target.
* Each input will have exactly one solution and we need not have to use the same number twice.
* */
public class TwoSum {
    private static int[] returnTwoSumIndices(int[] input, int target){
        HashMap<Integer, Integer> elementsMap = new HashMap<Integer, Integer>();
        int [] resultArray = new int[2];
        int elementComplement;
        for(int i=0;i<input.length;i++){
            elementComplement = target - input[i];
            if (elementsMap.containsKey(elementComplement)){
                resultArray[0] = elementsMap.get(elementComplement);
                resultArray[1] = i;
                break;
            }else{
                elementsMap.put(input[i], i);
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
	int[] input = new int[]{2, 7, 11, 15, 9};
	int target = 9;
    }
}
