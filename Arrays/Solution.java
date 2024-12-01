package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2,5};
        mergesort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

        int ans[]=single(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] single(int [] arr){
        ArrayList<Integer> list=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            boolean tem=true;
            for (int j = 0; j < arr.length; j++) {
                if(i!=j &&arr[i]==arr[j]){
                    tem=false;
                }
                }
            if(tem){
                list.add( arr[i]);
            }
        }
        int ansarray[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ansarray[i]=list.get(i);
        }
        return arr;
    }
    public static int singleNumber(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        mergesort(nums,0,nums.length);


        return 0;
    }
    public static void mergesort(int [] arr,int low,int high){
        if(high-low==1){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid,high);
        merge(arr,low,mid,high);
        
        
    }
    public static void merge(int[]arr,int low,int mid,int high){
        int mix[] =new int[high-low];
        
        int l=low;

        int j=mid;
        int k=0;
        
        while(l<mid && j<high){
            if(arr[l]<arr[j]){
                mix[k]=arr[l];
                l++;
                
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(l<mid){
            mix[k]=arr[l];
            l++;
            k++;
        }
        while(j<high){
           mix[k]=arr[j];
            j++;
            k++;  
        }
        for(int m=0;m<mix.length;m++){
            arr[low+m]=mix[m];
        }
    }
}