package Striver_Cheat_Sheet.Strings;

import java.util.*;

public class LongestSubstring {
    static int solve(String str) {

        if(str.length()==0)
            return 0;
        int maxans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet< >();
        int l = 0;
        for (int r = 0; r < str.length(); r++)
        {
            if (set.contains(str.charAt(r)))
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
    }

    public static void main(String args[]) {
        String str = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));

    }

}
