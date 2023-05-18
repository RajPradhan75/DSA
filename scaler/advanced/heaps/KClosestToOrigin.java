package datastructures.src.com.scaler.advanced.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;


public class KClosestToOrigin {
    public static void main(String[] args) {

//        int[][] points = {{1, 3},
//                {-2, 2}};
        int[][] points = {{2, 2}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {1, 1}};
        int k = 1;
        System.out.println(Arrays.deepToString(findKClosest(points, k)));
    }

    public static int[][] findKClosest(int[][] points, int k) {

        PriorityQueue<int[]> heaps = new PriorityQueue<>((a, b) -> getDistance(b) - getDistance(a));

        for (int[] point : points) {
            heaps.offer(point);
            if (heaps.size() > k) {
                heaps.poll();
            }
        }


        int[][] result = new int[k][2];
        int i = 0;

        while (!heaps.isEmpty()) {
            result[i++] = heaps.poll();
        }

        return result;
    }

    private static int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }


    public int[][] kClosest(int[][] points, int K) {
        int len =  points.length, l = 0, r = len - 1;
        while (l <= r) {
            int mid = helper(points, l, r);
            if (mid == K) break;
            if (mid < K) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return Arrays.copyOfRange(points, 0, K);
    }

    private int helper(int[][] A, int l, int r) {
        int[] pivot = A[l];
        while (l < r) {
            while (l < r && compare(A[r], pivot) >= 0) r--;
            A[l] = A[r];
            while (l < r && compare(A[l], pivot) <= 0) l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }

    private int compare(int[] p1, int[] p2) {
        return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
    }











}
