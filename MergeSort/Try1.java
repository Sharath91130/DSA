package MergeSort;

import java.util.Arrays;

public class Try1 {
    public static void main(String[] args) {
        int[] arr={12,11,1,2,3};

    }
    public static void merge(int [] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            merge(arr,low,mid);// asume this left side
            merge(arr,mid+1,high); /** asume this right side part of the array */



        }
    }
    public static void mergesort(int [] arr,int low ,int mid,int high){
        int [] left= Arrays.copyOfRange(arr,low,mid);
        int [] right= Arrays.copyOfRange(arr,low,mid);



    }
}
