import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        
        int [] arr={3,4,5,0,1,1,2,6};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    // Function to sort an array of 0s, 1s, and 2s
    public static void sort012(int [] arr) {
//        int []a=new int[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            a[i]=arr.get(i);
//
//        }
        System.out.println(Arrays.toString(arr));
            int i=0;
        while (i<arr.length) {
            int getIndex=arr[i];
            if(arr[getIndex]!=getIndex) {
                swap(arr,i,getIndex);
            }
            else{
                i++;
            }
//            if(getIndex==arr[getIndex]){
//                swap(arr,arr[getIndex]+1,arr[i]);
//            }


        }
        System.out.println(Arrays.toString(arr));

        
        // code here
    }
    public static void  swap(int [] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void  Sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {

        }
    }
}