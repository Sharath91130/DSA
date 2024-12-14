package Striver_Cheat_Sheet.Array;
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/


class Maximum_Points_You_Can_Obtain_from_Cards {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1};
        int ans = maxScore(arr, 3);
        System.out.println(ans);


    }

    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int l = cardPoints.length - 1;
        int r = k - 1;
        int maxx = 0;
        while (l > cardPoints.length - k - 1) {
            sum += cardPoints[l];
            sum -= cardPoints[r];
            maxx = Math.max(maxx, sum);
            l--;
            r--;
        }
        return maxx;


    }
}