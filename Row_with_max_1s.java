import java.lang.reflect.Array;
import java.util.Arrays;

public class Row_with_max_1s {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 0}
        };
        int ans = rowWithMax1s(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);


            }
            System.out.println();
        }
    }

    public static int rowWithMax1s(int arr[][]) {
        int count=-1;
        int help=-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1){
                    count++;
                }


            }
            if(arr.length==count){
                return i;
            }
            if(count>help){
                help=count;
                count=-1;
                return i;
            }

        }


      return help;
    }
}

