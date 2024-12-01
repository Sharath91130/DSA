package Arrays;

import java.util.HashMap;
import java.util.Map;

public class subArray_equalSum {
//    public  static int subarraySum(int[] nums, int k) {
//        int n = nums.length;
//        Map<Integer,Integer> mpp = new HashMap<>();
//        int preSum = 0, cnt = 0;
//        mpp.put(0, 1);
//        for (int i = 0; i < n; i++) {
//            preSum += nums[i];
//            int remove = preSum - k;
//            cnt +=mpp.getOrDefault(remove, 0);
//            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
//        }
//        return cnt;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5,6,7,};
        int ans = subarraySum(arr, 6);
//        System.out.println(ans);
        System.out.println(1-6);
    }

    private static int subarraySum(int[] nums, int k) {
        int preSum = 0, cnt = 0;
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
        preSum+=nums[i];
        int remove=preSum-k;
        cnt+=mpp.getOrDefault(remove,0);
        mpp.put(preSum,mpp.getOrDefault(preSum,0)+1);
        }
        return cnt;


    }
}