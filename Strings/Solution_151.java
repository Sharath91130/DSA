package Strings;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-words-in-a-string/
 class Solution_151 {
    public static void main(String[] args) {
         String s="sharth is good";
         String ans=reverseWords(s);
        System.out.println(ans);

    }
    public static String reverseWords(String s) {

        String []arr=s.trim().split("\\s+");


        String an="";
        for(int i=arr.length-1;i>0;i--){

            an+=arr[i]+" ";
        }


        return an+arr[0];
    }
}