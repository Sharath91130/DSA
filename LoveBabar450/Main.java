package LoveBabar450;//{ Driver Code Starts
import java.io.*;
import java.util.*;



class Solution {
    public static void reverseArray(int arr[]) {
        if(arr.length==1){
            return;
        }
        int first=0;
        int last=arr.length-1;
        
        while(first<arr.length/2){
            swap(arr,first,last);
            first++;
            last--;
        }
       for(int el:arr){
           System.out.print(el+" ");
       }
        
        
    }
    private static void swap(int [] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    public static void main(String[] args) {
        int [] arr={1, 4, 3, 2, 6, 5};
        reverseArray(arr);
    }
}