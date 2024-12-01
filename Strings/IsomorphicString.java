package com.basicStringQuestions;

public class IsomorphicString {

    static boolean IsomorphicStrings(String str1 ,String str2) {

        int freq1[] = new int[256];
        int freq2[] = new int[256];

        for(int i=0;i<str1.length();i++){
            if(freq1[str1.charAt(i)]!=freq2[str2.charAt(i)]){
                return false;
            }
            freq1[str1.charAt(i)] = i+1;
            freq2[str2.charAt(i)]=i+1;
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "xyz";
        String str2 = "aab";
        System.out.println(IsomorphicStrings(str1,str2));

    }
}
