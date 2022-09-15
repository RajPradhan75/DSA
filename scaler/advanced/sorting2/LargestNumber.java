package datastructures.src.com.scaler.advanced.sorting2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {

		List<Integer> A = Arrays.asList(3, 30, 34, 5, 9);

		System.out.println(solve(A));
	}

	private static String solve(List<Integer> A) {

		List<String> temp = new ArrayList<String>();

		for (Integer val : A)
			temp.add(String.valueOf(val));
		//custom sort - 3, 30, 34, 5, 9 == 330 >=303 | 343 >=334 | 35 >=53 | 39 >=93
		temp.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		String ans =  String.join("", temp);
		
		return ans.charAt(0) == '0' ? "0" : ans.toString();

	}

}
