package datastructures.src.com.neetcode.arraysandhashing;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

/*    private static int[] productExceptSelf(int[] nums){
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
    }*/


    // prefix & suffix product

/*    private static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int [] pre = new int[n];
        int [] suff = new int[n];
        pre[0] = 1;
        suff[n-1] = 1;

        // prefix product
        for (int i = 1; i < n; i++){
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        // suffix product
        for (int i = n - 2; i >=0; i--){
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        for (int i = 0 ; i < n; i++){
            ans[i] = pre[i] * suff[i];
        }

        return ans;
    }*/

    // optimized space complexity

    private static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int prefix = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }

}
