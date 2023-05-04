package datastructures.src.com.scaler.advanced.slidingwindow;

public class MedianOfTwoSortedArray {
    public class MedianOfTwoSortedArrays {
        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3};
            int[] nums2 = {4, 5, 6, 7};
            double median = findMedianSortedArrays(nums1, nums2);
            System.out.println("The median is " + median);
        }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;

            int [] merged = new int[n1 + n2];

            int i = 0, j = 0, k = 0;

            while(i < n1 && j < n2){
                if(nums1[i] <= nums2[j]){
                    merged[k++] = nums1[i++];
                }else{
                    merged[k++] = nums2[j++];
                }
            }

            while(i < n1){
                merged[k++] = nums1[i++];
            }

            while(j < n2){
                merged[k++] = nums2[j++];
            }

            int mid = merged.length / 2;
            if(merged.length % 2 == 0){
                return (double)(merged[mid - 1] + merged[mid]) / 2;
            }else{
                return (double) merged[mid];
            }

        }
    }

}
