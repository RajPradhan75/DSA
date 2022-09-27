package datastructures.src.com.scaler.advanced.hashing2;

import java.util.Arrays;

public class ReplicatingSubString {
	
	public static void main(String[] args) {
		int A = 2;
		String B = "bbaabb";
		System.out.println(solve(A,B));
	}
	
	private static int solve(int A, String B) {
	     // hash array to keep a track of frequency of each character
        int hash[] = new int[26];
        for (int i = 0; i < B.length(); i++) {
            hash[B.charAt(i) - 'a']++;
        }
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            // if the frequency of a charatcer present in the string isnt divisble by k, set
            // a flag which indicates that
            // it will never be possible to represent S as concatenation of K strings
            if (hash[i] % A != 0)
                flag = 1;
        }
        if (flag == 1)
            return -1;
        else
            return 1;
	}

}
