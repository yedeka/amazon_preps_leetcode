package com.gfg.gcl12.arrays_strings;

import java.util.HashMap;

public class RomanToInteger {
    private static HashMap<String, Integer> values = new HashMap<String, Integer>();
    static{
        values.put("I", 1);
        values.put("IV", 4);
        values.put("V", 5);
        values.put("X", 10);
        values.put("IX", 9);
        values.put("L", 50);
        values.put("XL", 40);
        values.put("C", 100);
        values.put("XC", 90);
        values.put("D", 500);
        values.put("CD", 400);
        values.put("M", 1000);
        values.put("CM", 900);
    }
    private static int toInteger(String s){
        int i=0, sum = 0;
        while(i < s.length()){
            if (i < s.length() - 1) {
                String doubleSymbol = s.substring(i, i + 2);
                // Check if this is the length-2 symbol case.
                if (values.containsKey(doubleSymbol)) {
                    sum += values.get(doubleSymbol);
                    i += 2;
                    continue;
                }
            }
            // Otherwise, it must be the length-1 symbol case.
            String singleSymbol = s.substring(i, i + 1);
            sum += values.get(singleSymbol);
            i += 1;
        }
        return sum;
    }
    public static void main(String[] args){
        String strInput = "MCDLXXIX";
        int number = toInteger(strInput);
        System.out.println("Roman => "+strInput+" Integer => "+number);
    }
}
