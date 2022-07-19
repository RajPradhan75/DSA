package datastructures.src.com.scaler.array.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		int[] nums = { 3, 30, 34, 5, 9 };
		
		System.out.println(solve(nums));

	}
	
	
	public static String solve(int[] nums) {
		
		if(nums == null || nums.length == 0)
			return "";
		
		String sNum [] = new String[nums.length];
		
		for(int i =0;i<nums.length;i++)
			sNum[i] = String.valueOf(nums[i]);
		
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1);  // reverse so we can append later
			}
		};
		
		Arrays.sort(sNum,comp);
		
		if(sNum[0].charAt(0) == '0') return "0"; //for a bunch of 0 in int array
		
		StringBuilder sb = new StringBuilder();
		for(String s: sNum)
		sb.append(s);
		
		return sb.toString();
	}

}
