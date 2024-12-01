package LoveBabar450.Array;

import java.util.TreeSet;

public class KthSmallest {
    private static int getKthElement(int [] arr, int k){
        TreeSet<Integer> treeSet=new TreeSet<>();

        for(Integer el:arr){
            treeSet.add(el);
        }
        System.out.println(treeSet);

       int arr1[]=new int[treeSet.size()];
       int index=0;
       for(int elment:treeSet){
           arr1[index]=elment;
           index++;

       }




       return arr1[k-1];

    }

    public static void main(String[] args) {
        int [] arr={2, 3, 1, 20, 15};
        int ans=getKthElement(arr,4);
        System.out.println(ans);
    }
}
