package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PathInDirectedGraph {
	static ArrayList<ArrayList<Integer>> adj;
	static int maxn = 100009;
	

	public static void main(String[] args) {
		int A = 5;
//		int[][] B = { { 1, 2 }, { 4, 1 }, { 2, 4 }, { 3, 4 }, { 5, 2 }, { 1, 3 } };
		int[][] B = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 3, 4 }, { 4, 5 } };
		System.out.println(solve(A, B));
	}

	public static int solve(int A, int[][] B) {
		int[] visited = new int[A + 1];
		adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= A; i++) {
			visited[i] = 0;
			adj.add(new ArrayList<Integer>());
		}
		for (int[] edge : B)
			adj.get(edge[0]).add(edge[1]);
		if (isReachable(1, A, visited) == true)
			return 1;
		return 0;
	}

	public static boolean isReachable(int s, int d, int[] visited) {
		if (s == d)
			return true;
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(s);
		visited[s] = 1;
		while (q.size() > 0) {
			s = q.poll();
			for (int v : adj.get(s)) {
				if (v == d)
					return true;
				if (visited[v] == 0) {
					visited[v] = 1;
					q.offer(v);
				}
			}
		}
		return false;
	}

}
