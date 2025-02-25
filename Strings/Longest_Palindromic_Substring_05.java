package Strings;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindromic_Substring_05 {
    public static void main(String[] args) {
 ;
        System.out.println(LongestPalindrome("babad"));

    }
    private static String LongestPalindrome(String s){

        int Ml=0;

        String ans=s.substring(0,1);

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+Ml;j<=s.length();j++){
                if(j-i>Ml && isPalindrome(s.substring(i,j))){
                    Ml=j-i;
                    ans=s.substring(i,j);
                }
            }
        }
        return ans;

    }
    private static  boolean isPalindrome(String s){
        if(s.length()<=1){
            return false;
        }
        int left=0;
        int right=s.length()-1;


        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
         return true;
    }



}


