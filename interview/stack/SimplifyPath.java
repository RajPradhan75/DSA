package datastructures.src.com.interview.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {


    private static String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        String[] components = path.split("/");

        for(String directory : components){
            if(directory.isEmpty() || directory.equals(".")){
                continue;
            }

            if(directory.equals("..")){
                if(!stack.isEmpty()){
                    stack.removeLast();
                }
            } else {
                stack.addLast(directory);
            }
        }

        return "/" + String.join("/", stack);
    }






    public static void main(String[] args) {
        String test1 = "/a/./b/../../c/";
        String test2 = "/home/";
        String test3 = "/../";
        String test4 = "/home//foo/";

        System.out.println("Test 1 Output: " + simplifyPath(test1)); // Expected: /c
        System.out.println("Test 2 Output: " + simplifyPath(test2)); // Expected: /home
        System.out.println("Test 3 Output: " + simplifyPath(test3)); // Expected: /
        System.out.println("Test 4 Output: " + simplifyPath(test4)); // Expected: /home/foo
    }
}
