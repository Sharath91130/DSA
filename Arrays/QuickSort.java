package Arrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={5,4,21,1,2};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void quick(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=(s+e)/2;
        int pivot=arr[mid];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
    public static void swap(int [] arr,int first,int second)
    {
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }
}
