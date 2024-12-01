package Arrays;

import java.util.Arrays;

public class QuickSortPractise1 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    private static void Quick(int [] arr,int Start ,int End){
        int s =Start;
        int e=End;

        if(Start>=End){
            return;

        }
        int mid=(s+e)/2;
        int pivot=arr[mid];
        while (s <e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;

            }


        }
        Quick(arr,Start,e);
        Quick(arr,s,End);
    }
    public static void swap(int [] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
