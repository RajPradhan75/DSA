package datastructures.src.com.interview;

import java.util.*;

public class FindDuplicateCharInString {

    public static void main(String[] args) {
        String str = "India";
        System.out.println(findDuplicate(str));
    }

    private static List<Character> findDuplicate(String str) {

        Set<Character> duplicateSet = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        char[] chars = str.toLowerCase().toCharArray();

        for (Character element : chars) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateSet.add(entry.getKey());
            }
        }

        for (Character character : duplicateSet ){
            list.add(character);
        }

        return list;
    }

}
