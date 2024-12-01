package com.basicStringQuestions;

public class PatternMatching {





    static void matchingNaive(String str1,String str2) {

        for(int i=0;i<=str1.length()-str2.length();i++){
                int j;
            for( j=0;j<str2.length();j++){
                if(str2.charAt(j)!=str1.charAt(i+j)){
                    break;
                }
            }
            if(j==str2.length()){
                System.out.println(i);
            }
        }

    }

    static void matching(String str1,String str2) {

        for(int i=0;i<=str1.length()-str2.length();i++){
            int j;
            for( j=0;j<str2.length();j++){
                if(str2.charAt(j)!=str1.charAt(i+j)){
                    break;
                }
            }
            if(j==str2.length()){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {

        String str1 = "ABCABCD";
        String str2 = "ABCD";
        matchingNaive(str1,str2);






    }

}
