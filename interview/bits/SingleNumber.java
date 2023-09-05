package datastructures.src.com.interview.bits;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 3, 1, 4};
        int uniqueElement = findSingle(nums);
        System.out.println("The unique element is: " + uniqueElement);
    }

    //---------------hashmap impl----------------

//    public static int findSingle(int[] nums) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // Count the frequency of each element in the array
//        for (int num : nums) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Find the unique element with a frequency of 1
//        for (int num : nums) {
//            if (frequencyMap.get(num) == 1) {
//                return num;
//            }
//        }
//
//        // Return a default value (0 in this example) if no unique element is found
//        return 0; // You can choose any suitable default value
//    }
//


 //-------------------bitwise------------------------

    private static int findSingle(int [] nums){
        int result = 0;
        for (int num: nums){
            result ^= num;
        }
        return result;
    }


 // --------------  for mutiple singles:-------------------
//
//    public static List<Integer> findSingles(int[] nums) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // Count the frequency of each element in the array
//        for (int num : nums) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Find unique elements with a frequency of 1
//        List<Integer> result = new ArrayList<>();
//        for (int num : nums) {
//            if (frequencyMap.get(num) == 1) {
//                result.add(num);
//            }
//        }
//
//        return result;
//    }
}
