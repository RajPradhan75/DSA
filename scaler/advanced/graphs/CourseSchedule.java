package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;

public class CourseSchedule {
    public static void main(String[] args) {
        int nums = 2;
        int[][] prerequistes = {{1, 0}};
        System.out.println(canFinish(nums, prerequistes));
    }

    private static boolean canFinish(int numCourses, int[][] prerequistes) {
        ArrayList[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < prerequistes.length; i++) {
            graph[prerequistes[i][1]].add(prerequistes[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, visited, i))
                return false;
        }
        return true;
    }

    private static boolean dfs(ArrayList[] graph, boolean[] visited, int course) {

        if (visited[course])
            return false;
        else
            visited[course] = true;

        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, visited, (int) graph[course].get(i)))
                return false;
        }
        visited[course] = false;
        return true;
    }
}
