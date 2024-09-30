package datastructures.src.com.neetcode.arraysandhashing;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            int product = 1 ;

            for (int j = 0; j <n ; j++){
                if (i != j)
                    product *= nums[j];
            }
            result[i] = product;
        }

        return result;
    }
}
