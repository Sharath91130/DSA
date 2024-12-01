package com.basicStringQuestions;

import java.util.Arrays;

public class AnagramsInString {


    static boolean optimizedAnagram(String str1,String str2){
        int cha[] = new int[26];
        for(int i=0;i<str1.length();i++){
            cha[str1.charAt(i)-'a']++;
            cha[str2.charAt(i)-'a']--;
        }
        for (int i = 0; i < cha.length; i++) {
            if(cha[i]!=0){
                return false;
            }
        }
        return  true;
    }

    static boolean anagramsCheck(String s1,String s2){
        s1 =s1.toLowerCase();
        s2=s2.toLowerCase();
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(new String(str1).equals(new String(str2))){
            return true;
        }
       return false;
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listens";
//        System.out.println(anagr  amsCheck(s1,s2));
        System.out.println(optimizedAnagram(s1,s2));
    }

}
