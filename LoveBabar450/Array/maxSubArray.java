package LoveBabar450.Array;

import java.util.Arrays;

public class maxSubArray {
    public static void main(String[] args) {
    int arr[]={-2,1,-3,4,-1,2,1,-5,4};
    int[] ans=maxSubArray1(arr);
        System.out.println(Arrays.toString(ans));
    }
        public static int maxSubarray(int[] nums) {
            int curSum = 0;
            int maxSum = Integer.MIN_VALUE; // Start with the smallest possible value

            for (int i = 0; i < nums.length; i++) {
                curSum += nums[i];
                maxSum = Math.max(maxSum, curSum); // Update maxSum at every step
                if (curSum < 0) { // Reset curSum if it becomes negative
                    curSum = 0;
                }
            }

            return maxSum;
        }
    public static int[] maxSubArray1(int[] nums) {
        if (nums.length == 1) {
            return new int[] { nums[0] }; // Return the single-element subarray
        }

        int cursum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];

            if (cursum > maxSum) {
                maxSum = cursum;
                start = tempStart;
                end = i;
            }

            if (cursum < 0) {
                cursum = 0;
                tempStart = i + 1; // Potential new start of a subarray
            }
        }

        // Extract the maximum subarray
        int[] resultArray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            resultArray[i - start] = nums[i];
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        return resultArray; // Return the subarray
    }
}

