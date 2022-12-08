package datastructures.src.com.scaler.advanced.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(permute(nums));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		// Arrays.sort(nums); // not necessary
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i])) 
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}


//public List<List<Integer>> permute(int[] nums) 
//{
//    List<List<Integer>> al = new ArrayList<>();
//	//taking an List of List which will traverse recursively via Call by reference
//    generate(nums, 0, nums.length-1, al); // passing that list of list as parameter
//    return al;    
//}
////Recursion logic:--
//
//static void generate(int a[], int i, int l, List<List<Integer>> al)
//{
//    if(i==l) //if index comes at last element of array
//    {
//        ArrayList<Integer> cl = new ArrayList<>();
//		//creating the list every time when the base conditions get hit
//        for(int x: a)
//        {
//            cl.add(x);
//        }
//        al.add(cl); //adding this list to list of list
//    }
//    else
//    {
//        for(int j = i; j<=l; j++) // loop from i to last element //after each recursion i will get incremented and loop will also change 
//        {
//            a = swap(a, i, j); //swapping ith element with jth element
//            generate(a, i+1, l, al); // further calling the recursion call again for further swaping
//            a = swap(a, j, i); //after the recursion ends returning back and swaping again the ith and jth element so that we get original array back for another recursion call
//        }
//        
//    }
//}
////Swap Function:---
//static int[] swap(int a[], int i, int j)
//{
//    int temp = a[i];
//    a[i] = a[j];
//    a[j]= temp;
//    return a;
//}
