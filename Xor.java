import java.util.ArrayList;
import java.util.Arrays;

public class Xor {
    public static void main(String[] args) {
        int ans = firstUniqChar("sharaths");
        System.out.println(ans);
    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            char temp = s.charAt(i);
            int add = (int) temp;
            arr[i] = add;
        }
        System.out.println(Arrays.toString(arr));





        int ans1 = search(arr);


        return ans1;
    }

    private static int search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean tem=false;
           for(int j=0;j<arr.length;j++){
               if(i==j){
                   continue;
               }
               else if(arr[i]==arr[j]){
                   tem=false;
                   break;
               }
               else{
                   tem=true;
               }
           }
           if(tem){
               return i;
           }
        }
        return -1;

    }
}