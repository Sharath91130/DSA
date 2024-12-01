
class MinimumJumps{
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int [] arr1={1, 3, 5, 7, 8, 5, 4, 3, 2, 6, 7, 11, 1, 2};
        int [] arr2={0, 10, 20};
        int ans=get(arr);
        System.out.println(ans);
        int ans1=get(arr1);
        System.out.println(ans1);
        int ans2=get(arr2);
        System.out.println(ans2);
    }
    static int minJumps(int[] arr) {
        if(arr[0]==0){
            return -1;
        }

        int i=0;
        int index=0;
        int count=1;
        int j=0;
        index=arr[j];

        while (i<arr.length) {


           if(index<arr[index]  && index< arr.length) {
               index=arr[index];
               count++;
           }
           i++;

        }
        return count;
    }
    public static int get(int [] arr){
        int index=arr[0];
        if(index==0){
            return -1;
        }
        int count=0;

        while(index<arr.length &&index!=arr[index]){
            index=arr[index];
            count++;
        }
        return count;
    }
}