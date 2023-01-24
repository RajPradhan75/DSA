package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Prims Algorithm
public class CommutableIslands {

	static class Pair {
		int weight;
		int u;
		int v;

		public Pair(int _u, int _v, int _w) {
			this.u = _u;
			this.v = _v;
			this.weight = _w;
		}
	}

	static class WeightComparator implements Comparator<Pair> {
		@Override
		public int compare(Pair o1, Pair o2) {
			return o1.weight - o2.weight;
		}
	}

	public static void main(String[] args) {
		int A = 4;
		int[][] B = { { 1, 2, 1 }, { 2, 3, 4 }, { 1, 4, 3 }, { 4, 3, 2 }, { 1, 3, 10 } };
		System.out.println(solve(A, B));
//		  We can choose bridges 
//		  (1, 2, 1), (1, 4, 3) and (4, 3, 2), 
//		  where the total cost incurred will be (1 + 3 + 2) = 6.
	}

	public static int solve(int A, int[][] B) {
		int totalCost = 0;

		// build Adjacency List
		List<List<Pair>> edges = buildAdjList(A, B);

		boolean[] visited = new boolean[A + 1];

		// initiate minHeap
		PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new WeightComparator());

		// insert node 1 (with cost 0) in queue
		queue.add(new Pair(1, 1, 0));

		while (!queue.isEmpty()) {
			Pair x = queue.poll();
			int x_target = x.v;
			if (!visited[x_target]) {
// mark current target node as visited and add weight to final cost

				visited[x_target] = true;
				totalCost += x.weight;

// traverse all neighbors of target node	

				for (Pair e : edges.get(x_target)) {
					int source = e.u;
					int target = e.v;
					if (visited[source] && visited[target]) {
						continue;
					} else if (!visited[source] || !visited[target]) {
						// if one th of node of neighbor is unvisited, add edge into queue
						queue.add(e);
					}
				}

			}
		}
		return totalCost;
	}

	public static List<List<Pair>> buildAdjList(int A, int[][] B) {

		List<List<Pair>> edges = new ArrayList<List<Pair>>();

		for (int i = 0; i <= A; i++) {
			edges.add(new ArrayList<Pair>());
		}

		for (int i = 0; i < B.length; i++) {
			int u = B[i][0];
			int v = B[i][1];
			int w = B[i][2];
			edges.get(u).add(new Pair(u, v, w));
			edges.get(v).add(new Pair(v, u, w));
		}
		return edges;
	}

}
