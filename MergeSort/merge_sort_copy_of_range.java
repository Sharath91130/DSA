package MergeSort;

import java.util.Arrays;

public class merge_sort_copy_of_range {
    public static void main(String[] args) {
        int [] arr={5,6,1,2,99,4};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[]    mergesort(int [] arr){

        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    private static  int [] merge(int[] left,int[] right){
       int [] arr=new int[left.length+right.length];
       int i=0;
       int j=0;
       int k=0;
       while (i<left.length && j<right.length){
           if(left[i]<right[j]){
               arr[k]=left[i];
               i++;
           }
           else {
               arr[k]=right[j];
               j++;
           }
           k++;
       }
       while (i<left.length){
           arr[k]=left[i];
           i++;
           k++;
       }
       while (j<right.length){
           arr[k]=right[j];
           j++;
           k++;
       }
       return arr;

    }
}
