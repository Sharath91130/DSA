package Arrays;

import java.util.Arrays;

class Next_permution31 {
    public  static void nextPermutation(int[] nums) {
        int index=-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0, nums.length-1);
            return;
        }

        for(int j=nums.length-1;j>index;j--){
            if(nums[j]>nums[index]){
                swap(nums,index,j);
            }
        }
        reverse(nums,index+1,nums.length-1);

        
    }
   public static void swap(int [] arr ,int left ,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void reverse(int [] arr,int start,int end){
        if(start>=end )
        {
            return;
        }
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr={3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}