package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

	public static void main(String[] args) {

		Integer[] list = new Integer[] { 1, 1, 2 };
		List<Integer> A = Arrays.asList(list);
		int B = 2;
		int C = 1;
		System.out.println(solve(A, B, C));
	}

	public static int solve(List<Integer> A, int B, int C) {
		List<Integer>[] adj = adjacency(A);
		boolean[] vis = new boolean[A.size() + 1];

		dfs(adj, C, vis);

		return vis[B] ? 1 : 0;

	}

	public static void dfs(List<Integer>[] adj, int s, boolean[] vis) {
		if (vis[s] == true)
			return;

		vis[s] = true;

		for (int i = 0; i < adj[s].size(); i++) {
			int n = adj[s].get(i);
			if (vis[n] == false)
				dfs(adj, n, vis);
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Integer>[] adjacency(List<Integer> A) {

		ArrayList<Integer>[] adj = new ArrayList[A.size() + 1];

		for (int i = 0; i <= A.size(); i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < A.size(); i++) {

			int source = A.get(i);
			adj[source].add(i + 1);
		}
		return adj;
	}

}
