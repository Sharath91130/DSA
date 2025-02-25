package Arrays;

import java.util.*;

public class Leetcode347 {
    public static void main(String[] args) {
       int [] arr={1,1,1,2,2,3};
       topKFrequent(arr,0);
    }
    public static void topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(frequencyMap.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll().getKey());
        }

        System.out.println(result);
    }
}
