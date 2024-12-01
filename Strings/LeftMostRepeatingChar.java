package com.basicStringQuestions;

public class LeftMostRepeatingChar {
    static int leftRepating(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "geeksofgeeks";
        String str1 = "abcd";
        System.out.println(leftRepating(str1));
    }
}
