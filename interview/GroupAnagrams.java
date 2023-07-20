package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        if (strings == null || strings.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strings) {

            char[] chr = new char[26];
            for (char c : s.toCharArray())
                chr[c - 'a']++;

            String keyStr = String.valueOf(chr);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());

            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
