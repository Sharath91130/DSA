package com.basicStringQuestions;

public class FrequencyOfString {
    public static void main(String[] args) {
            String str = "hello world";

            int count[] = new  int[26];

            for(int i=0;i<str.length();i++){
                    if(str.charAt(i)==' '){
                        continue;
                    }
                count[str.charAt(i)-'a']++;
            }

            for (int i=0;i<count.length;i++){
                if(count[i]>0){
                    System.out.println((char)(i+'a')+" "+count[i]);
                }
            }
    }
}
