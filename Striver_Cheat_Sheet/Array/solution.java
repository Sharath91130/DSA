package Striver_Cheat_Sheet.Array;// Java code to print all possible subarrays for given array
// using recursion

import java.util.ArrayList;
import java.util.List;

class solution {


    static void printSubArrays(int[] arr, int start, int end,List<List<Integer>> finalans)
    {
        List<Integer> temp=new ArrayList<>();


        if (end == arr.length) {
            return;
        }

        else if (start > end) {
            printSubArrays(arr, 0, end + 1, finalans);
        }

        else {

            for (int i = start; i < end; i++) {
               temp.add(arr[i]);
            }
            temp.add(arr[end]);
           finalans.add(temp);
            printSubArrays(arr, start + 1, end,finalans);
        }

    }

    public static void main(String args[])
    {
        int[] arr = {1,1,2,1,1};
        List<List<Integer>> finalans=new ArrayList<>();
        printSubArrays(arr, 0, 0,finalans);
        int v=0;
        for(List<Integer> el:finalans){
            int ans=Oddcount(el);
            if(ans==3){
                v++;
            }
        }

        System.out.println(v);
    }
    private static int Oddcount(List<Integer> arr ){
        int count=0;

        for(int el:arr){
            if(el%2!=0){
                count++;
            }
        }
        return  count;
    }
}

