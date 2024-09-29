package datastructures.src.com.neetcode.arraysandhashing;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String [] strs){

        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

         for (String str : strs){
            char[] chr = new char[26];

            for (char c : str.toCharArray()){
                chr[c - 'a']++;
            }

            String keyStr = String.valueOf(chr);
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }

            map.get(keyStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
