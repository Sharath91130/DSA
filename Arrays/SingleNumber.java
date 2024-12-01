package Arrays;

import java.util.HashMap;

public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array and update the frequency count in the map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Traverse the map to find the number with a frequency of 1
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        // Return -1 if no single number is found (this shouldn't happen with valid input)
        return -1;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in test case 1: " + findSingleNumber(nums1)); // Output: 1
        
        // Test case 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in test case 2: " + findSingleNumber(nums2)); // Output: 4
        
        // Test case 3
        int[] nums3 = {1};
        System.out.println("Single number in test case 3: " + findSingleNumber(nums3)); // Output: 1
    }
}
