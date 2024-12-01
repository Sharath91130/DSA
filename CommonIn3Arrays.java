import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonIn3Arrays {
    public static void main(String[] args) {
       int A[] = {1, 5, 10, 20, 30};int B[] = {5, 10, 15, 25,50};int C[] = {5, 20};

        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        List<Integer> arr3=new ArrayList<>(); List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            arr1.add(A[i]);

        }for (int i = 0; i < B.length; i++) {
            arr2.add(B[i]);

        }for (int i = 0; i < C.length; i++) {
            arr3.add(C[i]);

        }

        ans=commonElements(arr1,arr2,arr3);
        System.out.println(Arrays.toString(ans.toArray()));

    }
    public static void get(int a[],int b[],int c[]){
        ArrayList<Integer> list=new ArrayList<>();


        boolean help1=false;
        boolean help2=false;
        for (int i = 0; i < a.length; i++) {

//            if(!help1 && help2==false) {
//                help1 = BinarySearch(b, a[i]);
//                help1 = BinarySearch(c, a[i]);
//            }
             if(help1==true && help1==true){
               list.add(a[i]);
                help1=false;
                help2=false;
            }

        }
        System.out.println(Arrays.toString(list.toArray()));

        if(list.isEmpty()){
            System.out.println(-1);
        }




    }
    public static boolean BinarySearch(List<Integer> arrlist,int target){
        int[] ints = new int[arrlist.size()];

        for (int i = 0; i < arrlist.size(); i++) {
           ints[i]=arrlist.get(i);
        }

        int s=0;
         int e=ints.length-1;
         while(s<=e){
             int mid=(s+e)/2;
             if(ints[mid]==target){
                 return true;
             }
             if(ints[mid]>target){
                 e=mid-1;
             }
             else {
                 s=mid+1;
             }
         }
        return false;
    }
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        List<Integer>ans=new ArrayList<>();

        boolean help1=false;
        boolean help2=false;
        for (int i = 0; i < arr1.size(); i++) {

            if(!help1 && help2==false) {
                help1 = BinarySearch(arr2, arr1.get(i));
                help1 = BinarySearch(arr3, arr1.get(i));
            }
            if(help1==true && help1==true){
                ans.add(arr1.get(i));
                help1=false;
                help2=false;
            }

        }
        System.out.println(Arrays.toString(ans.toArray()));

        if(ans.isEmpty()){
            ans.add(-1);
           return ans;
        }
        return ans;
    }
}



