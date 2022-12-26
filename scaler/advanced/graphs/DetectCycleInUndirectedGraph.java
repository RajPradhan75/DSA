package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUndirectedGraph {
	public static void main(String[] args) {
		int v = 8;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(1).add(2);
		adj.get(1).add(3);
		adj.get(2).add(1);
		adj.get(2).add(5);
		adj.get(3).add(1);
		adj.get(3).add(4);
		adj.get(3).add(6);
		adj.get(4).add(3);
		adj.get(5).add(2);
		adj.get(5).add(7);
		adj.get(6).add(3);
		adj.get(6).add(7);
		adj.get(7).add(5);
		adj.get(7).add(6);
		DetectCycleInUndirectedGraph obj = new DetectCycleInUndirectedGraph();
		boolean ans = obj.isCycle(v, adj);
		if (ans)
			System.out.println("1");
		else
			System.out.println("0");
	}

	public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[], int parent[]) {
		Queue<Node> q = new LinkedList<>(); // BFS
		q.add(new Node(s, -1));
		vis[s] = true;

		// until the queue is empty
		while (!q.isEmpty()) {
			// source node and its parent node
			int node = q.peek().first;
			int par = q.peek().second;
			q.remove();

			// go to all the adjacent nodes
			for (Integer it : adj.get(node)) {
				if (vis[it] == false) {
					q.add(new Node(it, node));
					vis[it] = true;
				}

				// if adjacent node is visited and is not its own parent node
				else if (par != it)
					return true;
			}
		}

		return false;
	}

	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean vis[] = new boolean[V];
		Arrays.fill(vis, false);
		int parent[] = new int[V];
		Arrays.fill(parent, -1);

		for (int i = 0; i < V; i++)
			if (vis[i] == false)
				if (checkForCycle(adj, i, vis, parent))
					return true;
		return false;
	}

	static class Node {
		int first;
		int second;

		public Node(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
}
