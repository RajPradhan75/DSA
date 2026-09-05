package datastructures.src.com.interview.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicates {

    public static String removeDuplicates(String s){

/*        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < s.length() - 1){
            if(s.charAt(i) == s.charAt(i + 1)){
                sb.delete(i, i + 2);
                i = 0;
            }else {
                i++;
            }
        }
        return sb.toString();*/


        // Optimized Approach using Stack

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peekLast() == c){
                stack.removeLast();
            }else{
                stack.addLast(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char c : stack){
            result.append(c);
        }

        return result.toString();

    }








    public static void main(String[] args) {
        String test1 = "abbaca";
        String test2 = "azxxzy";
        String test3 = "aababaab";


        System.out.println("Test 1 Output: " + removeDuplicates(test1)); // Expected: ca
        System.out.println("Test 2 Output: " + removeDuplicates(test2)); // Expected: ay
        System.out.println("Test 3 Output: " + removeDuplicates(test3)); // Expected: ba
    }
}
