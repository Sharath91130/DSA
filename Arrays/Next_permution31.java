package Arrays;

class Next_permution31 {
    public void nextPermutation(int[] nums) {
        
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
            arr[start]=arr[end];
            start++;
            end--;
        }
    }
}