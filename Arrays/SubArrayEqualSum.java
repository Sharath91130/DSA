package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayEqualSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 6;
        List<List<Integer>> result = subarraySum(arr, k);
        System.out.println(result); // Output: All subarrays that sum up to 6
    }

    private static List<List<Integer>> subarraySum(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> mpp = new HashMap<>();
        int preSum = 0;
        mpp.put(0, new ArrayList<>());
        mpp.get(0).add(-1); // To handle subarrays starting from index 0

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;

            if (mpp.containsKey(remove)) {
                for (int startIndex : mpp.get(remove)) {
                    result.add(getSubarray(nums, startIndex + 1, i));
                }
            }

            mpp.putIfAbsent(preSum, new ArrayList<>());
            mpp.get(preSum).add(i);
        }

        return result;
    }

    private static List<Integer> getSubarray(int[] nums, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subarray.add(nums[i]);
        }
        return subarray;
    }
}
