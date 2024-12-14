package Striver_Cheat_Sheet.Strings;
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/


public class Number_of_Substrings_Containing_All_Three_Characters {

    public static  int numberOfSubstrings(String s) {
        int[] freq = {-1, -1, -1};
        int count = 0;

        for (int left = 0; left < s.length(); left++) {
            freq[s.charAt(left) - 'a'] = left;

            if (freq[0] != -1 && freq[1] != -1 && freq[2] != -1) {
                count += 1 + Min(freq[0], freq[1], freq[2]);
            }

        }
        return count;

    }
    public static void main(String[] args) {
        String s="abc";
        int ans=numberOfSubstrings(s);
        System.out.println(ans);
    }
    private static int Min(int a,int b,int c){
        int min = Math.min(a,b);
        if(c<min){
            return c;
        }
        return min;
    }
}
