package datastructures.src.com.scaler.string;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String A = "babad";
		System.out.println(solve(A));
	}

	public static String solve(String A) {
		
		   String max = "";
	        for (int i = 0; i < A.length(); i++) {
	            String s1 = extend(A, i, i); 
	            String s2 = extend(A, i, i + 1);
	            if (s1.length() > max.length()) max = s1;
	            if (s2.length() > max.length()) max = s2;
	        }
	        return max;
	    }
	    
	    private static String extend(String A, int i, int j) {
	        while(i>=0 && j<A.length()){
	         
	            if(A.charAt(i) != A.charAt(j)) break;
	               i--;
	               j++;
	            
	        }

	        return A.substring(i + 1, j);
	    }

	}


