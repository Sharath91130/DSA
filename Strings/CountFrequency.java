package com.basicStringQuestions;

import java.util.HashMap;
import java.util.TreeMap;

public class CountFrequency {

    static void freqCount(String str) {

        int count[] = new int[26];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i< count.length;i++){
            if(count[i]>0){

                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }


        }


    public static void main(String[] args) {
        String str = "geeksofgeeks";
//        freqCount(str);
        System.out.println((char)('a'+97));
    }
}
