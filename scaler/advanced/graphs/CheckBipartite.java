package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBipartite {
	public static void main(String[] args) {
		int A = 10;
	
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A; i++)
			adj.add(new ArrayList<Integer>());
//		addEdge(adj, 0, 1);
//		addEdge(adj, 0, 2);
//		addEdge(adj, 1, 2);
		
		addEdge(adj, 7, 8);
		addEdge(adj, 1, 2);
		addEdge(adj, 0, 9);
		addEdge(adj, 1, 3);
		addEdge(adj, 6, 7);
		addEdge(adj, 0, 3);
		addEdge(adj, 2, 5);
		addEdge(adj, 3, 8);
		addEdge(adj, 4, 8);
		
		
		System.out.println(adj);
		
		int ans = checkBipartite(adj, A) == true? 1:0;
		System.out.println(ans);
	}

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n) {

		int color[] = new int[n];
		for (int i = 0; i < n; i++) {
			color[i] = -1;
		}

		for (int i = 0; i < n; i++) {
			if (color[i] == -1) {
				if (!bfsCheck(adj, i, color)) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int color[]) {

		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		color[node] = 1;
		while (!q.isEmpty()) {
			Integer nde = q.poll();

			for (Integer it : adj.get(nde)) {

				if (color[it] == -1) {
					color[it] = 1 - color[nde];
					q.add(it);
				} else if (color[it] == color[nde]) {
					return false;
				}

			}
		}
		return true;
	}
}
