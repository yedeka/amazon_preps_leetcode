package com.gfg.gcl12.arrays_strings;


public class MaximumWaterContainer {
    private static int findMaxWater(int[] arrInput){
        int windowStart = 0, windowEnd = arrInput.length - 1, maxArea = 0, minElement;
        for (int i=0;i<arrInput.length;i++){
            if(windowStart > windowEnd) break;
            minElement = Math.min(arrInput[windowStart], arrInput[windowEnd]);
            maxArea = Math.max(maxArea, minElement * (windowEnd - windowStart));
            if(minElement == arrInput[windowStart]) windowStart++;
            if(minElement == arrInput[windowEnd]) windowEnd--;
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] input = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        // int[] input = new int[] {1, 1};
        int maxArea = findMaxWater(input);
        System.out.println("Max area => "+maxArea);
    }
}
