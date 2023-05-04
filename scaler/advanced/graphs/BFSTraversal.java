package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			adj.add(new ArrayList<>());
		}

//		adj.get(0).add(1);
//		adj.get(1).add(0);
//		adj.get(0).add(4);
//		adj.get(4).add(0);
//		adj.get(1).add(2);
//		adj.get(2).add(1);
//		adj.get(1).add(3);
//		adj.get(3).add(1);

		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(1).add(5);
		adj.get(5).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);
		adj.get(2).add(5);
		adj.get(5).add(2);
		adj.get(5).add(3);
		adj.get(3).add(5);
		adj.get(5).add(4);
		adj.get(4).add(5);

		BFSTraversal bfsTraversal = new BFSTraversal();
		ArrayList<Integer> ans = bfsTraversal.bfsOfGraph(5, adj);
		int n = ans.size();
		for (int i = 0; i < n; i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> bfs = new ArrayList<>();

		boolean vis[] = new boolean[V+1];
		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		vis[1] = true;

		while (!q.isEmpty()) {

			Integer node = q.poll();
			bfs.add(node);

			for (Integer it : adj.get(node)) {
				if (vis[it] == false) {
					vis[it] = true;
					q.add(it);
				}
			}
		}

		return bfs;

	}

}
