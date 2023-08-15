package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseSchedule {

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] preRequistes = {{1, 0}};
        System.out.println(canFinish(numCourses, preRequistes));
    }

    private static boolean canFinish(int numCourses, int[][] preRequites) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < preRequites.length; i++) {
            adj.get(preRequites[i][0]).add(preRequites[i][1]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (isCyclic((adj), visited, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isCyclic(List<List<Integer>> adj, int[] visited, int curr) {
        if (visited[curr] == 2) {
            return true;  // If we're currently visiting this course again, it means we found a loop.
        }

        visited[curr] = 2;  // Mark the current course as "currently visiting".

        for (int i = 0; i < adj.get(curr).size(); i++) {
            // For each prerequisite of the current course:
            if (visited[adj.get(curr).get(i)] != 1) {
                // If the prerequisite hasn't been fully visited (not marked as 1):
                if (isCyclic(adj, visited, adj.get(curr).get(i))) {
                    return true;  // If a loop is found in prerequisites, return true.
                }
            }
        }

        visited[curr] = 1;  // Mark the current course as fully processed.

        return false;  // No loop was found in prerequisites of the current course.
    }



}
