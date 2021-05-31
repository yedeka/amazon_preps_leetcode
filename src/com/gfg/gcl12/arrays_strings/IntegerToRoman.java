package com.gfg.gcl12.arrays_strings;

public class IntegerToRoman {
    private static final int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] symbols = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    private static String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<values.length && num>0;i++){
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int input = 671;
        String strRoman = intToRoman(input);
        System.out.println("Number "+input+" Roman => "+strRoman);
    }
}
