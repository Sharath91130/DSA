package LoveBabar450.Array;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ma=new int[m+n];
        
        int fst=0;
        int second=0;
        int k=0;
        
        while(fst<m && second<n){
            if(nums1[fst]<nums2[second]){
                ma[k]=nums1[fst];
                fst++;
            }
            else{
                ma[k]=nums2[second];
                second++;
            }
            k++;
        }
        while(fst<m){
            ma[k]=nums1[fst];
            fst++;
            k++;
        }
        while(second<n){
            ma[k]=nums2[second];
                second++;
            k++;
        }
        for(int i =0;i<ma.length;i++){
            nums1[i]=ma[i];
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,0,0,0};
        int arr2[]={2,3,5};
        int m=3;
        int n=3;

        merge(arr,m,arr2,n);;
        System.out.println(Arrays.toString(arr));
    }


}