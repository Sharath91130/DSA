package LoveBabar450.Array;

import java.util.Arrays;
import java.util.TreeSet;

// https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
public class MinimizetheHeights {
    public static void main(String[] args) {
        int [] arr={1 ,8 ,10 ,6 ,4 ,6 ,9 ,1};
        getMinDiff(arr,7);

    }
    private static void getMinDiff(int[] arr, int k) {
        int help=0;
        for (int i = 0; i < arr.length; i++) {
            if(help<k-1){
                arr[i]=arr[i]+k;
                help++;
            }
            else{
                arr[i]=arr[i]-k;
            }

        }
        System.out.println(Arrays.toString(arr));
        TreeSet<Integer> set=new TreeSet<>();

        for(int element:arr){
            set.add(element);
        }
        System.out.println(set);
        int small=set.first();
        int large=set.last();
        System.out.println(small-large);

    }
}
