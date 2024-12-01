package LoveBabar450.Array;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2,3};
        boolean ans=Check(arr);
        System.out.println(ans);

    }
    private static boolean Check(int [] nums){
        if(nums[0]>nums[1]){
            return false;
        }
         boolean tem=false;


        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1]){
                tem=true;
            }

        }
        return tem;
    }
}
