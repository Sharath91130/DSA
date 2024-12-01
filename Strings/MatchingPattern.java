package com.basicStringQuestions;

import java.sql.SQLOutput;

public class MatchingPattern {

    static void matching(String text,String pattern) {

        for(int i=0;i<=text.length()-pattern.length();i++){
                int j;
            for( j=0;j<pattern.length();j++){
                if(pattern.charAt(j)!=text.charAt(i+j)) {
                    break;
                }
            }
            if(j==pattern.length()){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        String str = "ABCDABABABCD";
        String pattern = "ABCD";
        matching(str,pattern);
    }
}
