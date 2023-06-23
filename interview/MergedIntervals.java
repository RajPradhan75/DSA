package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergedIntervals {
    public static void main(String[] args) {

        int[][] arr = {{1, 3},{8, 10}, {2, 6},  {15, 18}};
        System.out.println(Arrays.deepToString(mergeInteral(arr)));


    }

    private static int[][] mergeInteral(int[][] intervals) {
        // Check if there are no intervals or only one interval
        if (intervals.length <= 1) return intervals;

        // Sort the intervals based on their start times
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        // Create a list to store the merged intervals
        List<int[]> result = new ArrayList<>();

        //Assign the first interval as the initial merged interval
// Add the initial merged interval to the result list
        int[] newInterval = intervals[0];

        result.add(newInterval);
        // Iterate over each interval in the sorted array

        for (int[] interval : intervals) {
            // Check if there is an overlap between the current interval and the new merged interval
            if (interval[0] <= newInterval[1]) {
                // Update the end time of the merged interval to the maximum of the current interval's end time and the merged interval's end time
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                // No overlap, create a new merged interval using the current interval and add it to the result list
                newInterval = interval;
                result.add(newInterval);
            }
        }


        return result.toArray(new int[result.size()][]);


    }


}
