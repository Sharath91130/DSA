package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_345 {
    public static void main(String[] args) {
        String ans = reverseVowels("IceCreAm");
        System.out.println(ans);
    }





    public static String reverseVowels(String s) {


        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Integer> indexlist=new ArrayList<>();

        
        
        for(int i=0;i<s.length();i++)
        {
            if(Checkvowels(s.toLowerCase().charAt(i))){
                list.add(s.charAt(i));
                indexlist.add(i);
            }
        }

        char [] arr=s.toCharArray();
        int decreVarible=0;
        int listSize=indexlist.size()-1;
        for (int i=0;i<indexlist.size()/2;i++){
            swap(arr,indexlist.get(decreVarible),indexlist.get(listSize));
            System.out.println(indexlist.get(decreVarible)+" "+indexlist.get(listSize));
            System.out.println(Arrays.toString(arr));
            decreVarible++;
            listSize--;

        }
        System.out.println(indexlist);


        System.out.println(Arrays.toString(arr));



        System.out.println(Arrays.toString(arr));
        String ans= Arrays.toString(arr);
        return ans;
    }
    
    private static boolean Checkvowels( char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
        
    }
    private static void swap(char[] arr,int first,int  last){
        char temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }

}