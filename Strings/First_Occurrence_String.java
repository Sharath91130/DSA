package Strings;

public class First_Occurrence_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sade";
        int ans=strStr(haystack,needle);
        System.out.println(ans);
    }
    public static int strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length()-needle.length()+1;i++){
           if(haystack.charAt(i)==needle.charAt(0)){
               if(haystack.substring(i,needle.length()+i).equals(needle)){
                   return 1;
               }
           }
       }
       return -1;
    }
}
