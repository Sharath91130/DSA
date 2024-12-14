package Striver_Cheat_Sheet.Array;

import java.util.ArrayList;
import java.util.List;

public class SubArrayGenerator {

    public static void generateSubArrays(int[] arr, int start, int end, List<List<Integer>> result) {
        // Base case: If start exceeds array length, stop recursion
        if (start >= arr.length) {
            return;
        }


        if (end > arr.length) {
            generateSubArrays(arr, start + 1, start + 1, result);
            return;
        }


        List<Integer> currentSubArray = new ArrayList<>();
        for (int i = start; i < end; i++) {
            currentSubArray.add(arr[i]);
        }
        result.add(currentSubArray);


        generateSubArrays(arr, start, end + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        int ans = numSubarraysWithSum(arr, 0);
        System.out.println(ans);
    }

    private static int numSubarraysWithSum(int[] nums, int goal) {
        List<List<Integer>> temp = new ArrayList<>();
        generateSubArrays(nums, 0, 0, temp);
        int tempvariable = 0;
        for (List<Integer> ans : temp) {
            System.out.println(ans);
            int sum = sumans(ans);
            if (sum == goal) {
                tempvariable++;
            }
        }
        return tempvariable;
    }
    private static int sumans(List<Integer> temp){
        int sum=0;
        for (int i = 0; i < temp.size(); i++) {
            sum+=temp.get(i);

        }
        return sum;
    }
}