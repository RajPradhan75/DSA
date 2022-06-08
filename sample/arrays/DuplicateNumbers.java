package datastructures.src.com.sample.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] nums = { 4,3,2,7,8,2,3,1 };

		List<Integer> duplicate_Number = findDuplicateNum(nums);
		System.out.println(duplicate_Number);
	}

	static List<Integer> findDuplicateNum(int[] nums) {

		List<Integer> output_arr = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0)
				output_arr.add(index + 1);
			nums[index] = -nums[index];
		}

		return output_arr;
	}
	
	
//	Map<Integer,Integer> map = new HashMap<>();
//    Set<Integer> set = new TreeSet<>();
//    for(int i = 0 ; i < n ; i++){
//        if(map.containsKey(arr[i])){
//            map.put(arr[i],map.get(arr[i])+1);
//            if(map.get(arr[i]) >= 2 && !set.contains(arr[i]))
//                set.add(arr[i]);
//        }
//        else{
//            map.put(arr[i],1);
//        }
//    }
//    ArrayList<Integer> al = new ArrayList<>(set);
//    if(al.isEmpty()){
//        al.add(-1);
//    }
//    return al;
// }

}
