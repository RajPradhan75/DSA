package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CourseFinish {
	public static void main(String[] args) {
//		int A = 3;
//		int[] B = { 1, 2, 3 };
//		int[] C = { 2, 3, 1 };
//		int result = CourseFinish.canFinish(A, B, C);
		// result will be 1

		int V = 3;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
			adj.get(1).add(2);
			adj.get(2).add(3);
			adj.get(3).add(1);
		boolean result = topoSort(V, adj);
		int ans = result == true ? 1 : 0;
		System.out.println(ans);
	}

	static int count = 0;

//	public static int canFinish(int A, int[] B, int[] C) {
////		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
////		adj = createAdj(B, C, A);
//		boolean ans = topoSort(A, adj);
//		return ans == true ? 1 : 0;
//	}

	public static ArrayList<ArrayList<Integer>> createAdj(int[] A, int[] B, int N) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			adj.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < B.length; i++) {
			int u = A[i];
			int v = B[i];
			adj.get(u).add(v);
		}
		return adj;
	}

	public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		int vis[] = new int[V + 1];

		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < V; i++) {
			if (vis[i] == 0) {
				dfs(i, vis, st, adj);
			}
		}

		int ans[] = new int[V + 1];
		int i = 0;
		while (!st.isEmpty()) {
			ans[i++] = st.peek();
			st.pop();
		}

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (Integer ans1 : ans) {
			list2.add(ans1);
		}

		if (count == list2.size() - 1) {
			return true;
		}
		return false;

	}

	private static void dfs(int node, int vis[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
		vis[node] = 1;

		for (int it : adj.get(node)) {
			if (vis[it] == 0)
				dfs(it, vis, st, adj);
		}
		st.push(node);
		count++;
	}

}
