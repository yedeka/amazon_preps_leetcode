package com.gfg.gcl12.arrays_strings;

import java.util.HashSet;
import java.util.Set;

/*
* Given a string s, find the length of the longest substring without repeating characters.
* Logic - Maintain a set of seen characters in the string and then while accessing every chatacter have a look at the set to determine duplictes.
* Upon finding the duplicates if length of substring between beginning index and current index is greater than maxlength then take the substring as max substring
* and increment begin index to the current index and proceed until end of string.
* */
public class LongestNonRepeatingSubstring {
    private static String findNRSubString(String strInput){
        //We will use a single pass hashtable to find out the longest substring
        char[] charArray = strInput.toCharArray();
        Set<Character> charset = new HashSet<>();
        int maxLength = 0, beginIndex=0;
        char currentChar;
        String strReturnString = "";
        for(int i=0;i<charArray.length;i++){
            currentChar = charArray[i];
            if(charset.contains(currentChar)){
                //check if the length of curretn unique substring is greater than the previously found substring
                if(i-beginIndex > maxLength){
                    strReturnString = strInput.substring(beginIndex, i);
                    maxLength = strReturnString.length();
                }
                beginIndex = i;
            }else{
                charset.add(currentChar);
            }
        }
        return strReturnString;
    }
    public static void main(String[] args){
        String strInput = "abcabcbb";
        String longestSubString = findNRSubString(strInput);
        System.out.println("Longest substring without repetition => "+longestSubString);
        strInput = "bbbbbbb";
        longestSubString = findNRSubString(strInput);
        System.out.println("Longest substring without repetition => "+longestSubString);
        strInput = "pwwkew";
        longestSubString = findNRSubString(strInput);
        System.out.println("Longest substring without repetition => "+longestSubString);
    }
}
