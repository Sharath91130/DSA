package Striver_Cheat_Sheet.Array;

import java.util.ArrayList;
import java.util.List;

public class Binary_subArray_withSum {
    public static void main(String[] args) {
         int [] arr={1,0,1,0,1};
         List<List<Integer>> temp=new ArrayList<>();
         helper(arr,0,0,temp);
        for(List<Integer> ans:temp){
            System.out.println(ans);
        }
    }
    private int numSubarraysWithSum(int[] nums, int goal) {
        List<List<Integer>> temp=new ArrayList<>();
        helper(nums,0,0,temp);
        int tempvariable=0;
        for(List<Integer> ans:temp){
           int sum=sum(ans);
           if(sum==goal){
               tempvariable++;
           }
        }
        return tempvariable;
    }
    private static int sum(List<Integer> temp){
        int sum=0;
        for (int i = 0; i < temp.size(); i++) {
            sum+=temp.get(i);

        }
        return sum;
    }
    private static void helper(int [] arr, int start,int end,List<List<Integer>> finalAns){
        if(start==arr.length){
            return ;
        }
        if(end==arr.length){
            helper(arr,start+1,start+1,finalAns);
        }
        else {
            finalAns.add(sum(arr, start, end));
            helper(arr, start, end + 1, finalAns);
        }


    }
    private static List<Integer> sum(int [] arr,int s,int e){
        List<Integer> ans=new ArrayList<>();
        for (int i = s; s < e; s++) {
            ans.add(arr[i]);

        }
        return ans;
    }

}


