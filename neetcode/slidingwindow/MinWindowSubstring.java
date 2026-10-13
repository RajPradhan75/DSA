package datastructures.src.com.neetcode.slidingwindow;

public class MinWindowSubstring {
    public static void main(String[] args) {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();

        // Test Case 1: Standard scenario
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Test Case 1: " + minWindowSubstring.minWindow (s1, t1)); // Output: "BANC"

       /* // Test Case 2: No valid window
        String s2 = "ABCDEFG";
        String t2 = "XYZ";
        System.out.println("Test Case 2: " + solution.minWindow(s2, t2)); // Output: ""

        // Test Case 3: Minimum window at the beginning
        String s3 = "ABCD";
        String t3 = "AB";
        System.out.println("Test Case 3: " + solution.minWindow(s3, t3)); // Output: "AB"

        // Test Case 4: Multiple valid windows
        String s4 = "ABAACBAB";
        String t4 = "ABC";
        System.out.println("Test Case 4: " + solution.minWindow(s4, t4)); // Output: "ACB"

        // Test Case 5: Entire string is the window
        String s5 = "ABC";
        String t5 = "ABC";
        System.out.println("Test Case 5: " + solution.minWindow(s5, t5)); // Output: "ABC"

        // Test Case 6: t longer than s
        String s6 = "AB";
        String t6 = "ABC";
        System.out.println("Test Case 6: " + solution.minWindow(s6, t6)); // Output: ""*/
    }

    public String minWindow(String s,String t){
        if (s == null || t == null ||
                s.isEmpty() || s.length() < t.length()){
            return "";
        }

        int[] tCounts = new int[128];
        for (char c : t.toCharArray()){
            tCounts[c]++;
        }

        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;

        for (int start = 0; start < s.length(); start++){

            int[] windowCounts = new int[128];

            for (int end = start; end < s.length(); end++){
                char currentChar = s.charAt(end);
                windowCounts[currentChar]++;

                boolean isValid = true;
                for (int i = 0; i < 128; i++){
                    if (tCounts[i] > 0 && windowCounts[i]<tCounts[i]){
                        isValid = false;
                        break;
                    }
                }

                if (isValid){
                    int currentWindowLength = end - start + 1;
                    if (currentWindowLength <minLength){
                        minLength = currentWindowLength;
                        startIdx = start;
                    }
                    break;
                }
            }
        }


        return startIdx == -1 ? "": s.substring(startIdx,
                startIdx + minLength);
    }
}
