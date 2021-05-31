package com.gfg.gcl12.arrays_strings;

import java.util.*;

/*
* Three sum problem without using sorting.
* */
public class ThreeSumNoSort {
    private static List<List<Integer>> findThreeSum(int[] nums){
        Set<Integer> dups = new HashSet<Integer>();
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
    public static void main(String[] args){
        int[] input = new int[]{-1,0,1,2,-1,-4};
        findThreeSum(input);
    }
}
