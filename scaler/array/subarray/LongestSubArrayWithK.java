package datastructures.src.com.scaler.array.subarray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithK {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubArray(a, k);
        System.out.println(len);
    }

    private static int getLongestSubArray(int[] a, long k) {
      /*
       Bruteforce

        int n = a.length;

        int len = 0;

        for (int i = 0; i < n; i++){
            long s = 0;
            for (int j = i; j <n ; j++){
                s+=a[j];

                if (s == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    O(n^2)
    */

        //Better Approach

/*        int n = a.length;

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            //calculate prefix sum till index i
            sum += a[i];

            // if the sum = k , update the maxLen
            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);

            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;*/

        int n = a.length;

        int left = 0, right = 0;

        long sum = a[0];

        int maxLen = 0;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return maxLen;
    }
}