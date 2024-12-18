package Strings;

// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution_387 {
    public int firstUniqChar(String s) {
        
        if(s.length()==1){
            return 0;
        }
          
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            char temp = s.charAt(i);
            int add = (int) temp;
            arr[i] = add;
        }
        





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
