package MergeSort;

import java.util.Arrays;

public class Practise1 {
    public static void main(String[] args) {
        int [] arr={1,5,2,3,8,4};
        MergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    private static void MergeSort(int [] arr,int s,int e){
        if(e-s==1){
            return;

        }
        int mid=(s+e)/2;
        MergeSort(arr,s,mid);
        MergeSort(arr,mid,e);
        Merge(arr,s,mid,e);



    }
    private static void Merge(int [] arr,int s,int mid,int e){
        int low =s;
        int high=mid;
        int k=0;

        int [] copyArray=new int[e-s];
        while(low<mid && high<e){
            if(arr[low]<arr[high]){
                copyArray[k]=arr[low];
                low++;

            }
            else{
                copyArray[k]=arr[high];
                high++;

            }
            k++;


        }
        while(low<mid && k< copyArray.length){
            copyArray[k]=arr[low];
            low++;
            k++;
        }
        while (high<e && k< copyArray.length){
            copyArray[k]=arr[high];
            high++;
            k++;
        }
        for (int i = 0; i < copyArray.length; i++) {
            arr[s+i]= copyArray[i];


        }


    }
}
