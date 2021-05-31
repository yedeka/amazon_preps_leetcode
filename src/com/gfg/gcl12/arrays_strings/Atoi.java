package com.gfg.gcl12.arrays_strings;

/*
* Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
* */
public class Atoi {
    private static int atoi(String s){
        // Step 1 ignore the whitespace at the beginning.
        s = s.trim();
        //Start parsing the string for integers
        String strResult = "";
        int iStart = 0, result = 0 ;
        if(s.length() > 0){
            if (s.charAt(0) == '+' || s.charAt(0) == '-'){
                if(s.charAt(0) == '-'){
                    strResult = strResult + s.charAt(0);
                }
                iStart = 1;
            }
            String currentChar;
            for(int i=iStart; i<s.length();i++){
                currentChar = String.valueOf(s.charAt(i));
                if(currentChar.matches("\\d")){
                    strResult = strResult + currentChar;
                }else{
                    break;
                }
            }
            if(strResult.trim().length() > 0){
                try{
                    if(strResult.matches("-?\\d+")){
                        result = Integer.parseInt(strResult);
                    }else{
                        result = 0;
                    }
                }catch(NumberFormatException numExc){
                    if (strResult.charAt(0) == '-'){
                        result = Integer.MIN_VALUE;
                    }else{
                        result = Integer.MAX_VALUE;
                    }

                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        //String strInput = "Input Input input ";
        //String strInput = "-91283472332";
        //String strInput = "+-12";
        String strInput = "+1";
        int atoiOutput = atoi(strInput);
        System.out.println("result of applying atoi function => "+atoiOutput);
    }
}
