package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.*;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));

    }
    public static String frequencySort(String s){
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        for(Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        System.out.println(list);
        list.sort((ob1,ob2) -> map.get(ob2)-map.get(ob1));
        System.out.println(list);
        for(Character c:list){
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
