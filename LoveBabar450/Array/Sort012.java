package LoveBabar450.Array;

import java.util.Arrays;

public class Sort012 {
    private static void sort012(int [] arr){
        int indexofZero=0;
        int IndexOfOne=0;
        int IndexOfTwo=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==0){
                indexofZero++;

            }
            if(arr[i]==1){
                IndexOfOne++;

            }
            if(arr[i]==2){
                IndexOfTwo++;

            }

        }
        int element=0;
        while(element<indexofZero){
            arr[element]=0;
            element++;
        }
        IndexOfOne+=indexofZero;
        while(element<IndexOfOne){
            arr[element]=1;
            element++;
        }
        IndexOfTwo+=IndexOfOne;
        while(element<IndexOfTwo){
            arr[element]=2;
            element++;
        }

    }

    public static void main(String[] args) {
        int [] arr={0,0,2,1,0,2,0,2,1,1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
