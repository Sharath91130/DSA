package com.basicStringQuestions;

import java.util.Arrays;

public class GautamStringProblem {

    static int[] mergeSoert(int arr[]) {
        if(arr.length==1){
            return arr;
        }

        int mid = (0+arr.length)/2;

        int[] left = mergeSoert(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSoert(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int left[] , int right[]) {
        int mix[] = new int[left.length+right.length];
        int i = 0;
        int j=0;
        int k=0;
        while(i < left.length && j <right.length){
            if (left[i] < right[j]){
                mix[k]=left[i];
                i++;
            }
            else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while( j < right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return  mix;
    }


    public static void main(String[] args) {
        String str= "1,2,-3,22,-5,9";
        String str2 = "8,-12,7,5,18,13";


        String str3 = str+","+str2;

        String[] arr = str3.split(",");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            if(n > 0){
                count++;

            }

        }
        System.out.println(count);
        int positiveArr[] = new int[count];
        int negativeArr[] = new int[arr.length-count];
            int posIndex=0;
            int negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.valueOf(arr[i]);
            if(n > 0){
               positiveArr[posIndex++] = n;
//               posIndex++;

            } else if (n <=0) {
                negativeArr[negIndex++] = n;
//                negIndex++;

            }

        }



        System.out.println(Arrays.toString(positiveArr));
        System.out.println(Arrays.toString(negativeArr));

        int mix[] = mergeSoert(positiveArr);
        System.out.println(Arrays.toString(mix));




    }
}
