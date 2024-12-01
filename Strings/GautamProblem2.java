package com.basicStringQuestions;

import java.util.Arrays;

public class GautamProblem2 {
    public static void main(String[] args) {
        String str= "1,2,-3,22,-5,9";
        String str2 = "8,-12,7,5,18,13";

        String [] arr= str.split(",");
        String [] arr1 = str2.split(",");

        int arr2[] = new int[arr.length+arr1.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.valueOf(arr[i]);
            if(n > 0){
                arr2[count++]=n;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            int n = Integer.valueOf(arr1[i]);
            if(n > 0){
                arr2[count++]=n;
            }
        }
        int finals[] = Arrays.copyOf(arr2,count);
        System.out.println(Arrays.toString(finals));
    }
}
