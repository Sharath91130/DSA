package GFG;

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElement(int[] arr,int n)
    {
       if(help(arr)){
           return 0;
       }
       int ans=0;

       int s=0;
       int e=arr.length;
       while(s<=e){
           int mid=(s+e)/2;
           if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
               return arr[ mid+1];
           }
       }
       return arr[0];
    }
    private static boolean help(int [] arr){
        boolean temp=false;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
                temp=true;
            }
            else {
                temp=false;
                break;
            }
        }
        return temp;

    }


    public static void main(String[] args) {
        int [] arr={1, 1, 1, 2, 1, 1, 1};
        int ans=peakElement(arr,arr.length);
        System.out.println(ans);
    }

}