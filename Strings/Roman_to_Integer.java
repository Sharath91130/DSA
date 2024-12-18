package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class  Roman_to_Integer{
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',100);
        map.put('b',100);
        System.out.println(map.get('a'));
    }
    public static int romanToInt(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }else{
                ans+=map.get(s.charAt(i));
            }
        }
        return ans;

    }
}