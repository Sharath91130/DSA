package LoveBabar450.Array;

import java.util.Arrays;
import java.util.TreeSet;

public class findUnion {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={1, 2, 3, 4, 5};
        int ans=findUnion(a,b);
        System.out.println(ans);

    }
    public static int findUnion(int a[], int b[]) {
       int MergeArray[]=new int[a.length+b.length];
           int increment=0;
        System.out.println(MergeArray.length);
        for (int i = 0; i < a.length; i++) {
            MergeArray[i]=a[i];
            increment++;

        }
        System.out.println(increment);
        System.out.println(Arrays.toString(MergeArray));
        for (int i = increment-1; i<MergeArray.length-1; i++) {
            MergeArray[i]=b[i];

        }
        System.out.println(Arrays.toString(MergeArray));
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:MergeArray){
            set.add(i);
        }
        System.out.println(set.size());
        return  set.size();
    }


}
