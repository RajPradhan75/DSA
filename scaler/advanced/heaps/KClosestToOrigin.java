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
}
