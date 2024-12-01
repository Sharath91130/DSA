package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Row_with_max_1s {

    public static void main(String[] args) {
        int[][] arr = {
                {0,0, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 1},
                {0, 0, 0,1}
        };
        int [][] arr1={
                {1,1},
                {0,1},
                {1,1}};
        int ans = rowWithMax1s(arr1);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);


            }
            System.out.println();
        }
        System.out.println(ans);
    }

    public static int rowWithMax1s(int arr[][]) {
        int count=0;
        int help=-1;
        int ans=-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1){
                    count++;
                }


            }
            if(arr.length==count){
                return i;
            }
            if(count>help &&count!=0) {
                help=count;

                ans=i;
                //return i;
            }
            count=0;


        }


      return ans;
    }
}

