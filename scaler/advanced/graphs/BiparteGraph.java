package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BiparteGraph {
	public static void main(String[] args) {
//		int n = 7;
		int n = 9;
		


//					[8, 2]
//				  [2, 5]
//				  [2, 3]
//				  [2, 1]
//				  [8, 7]
//				  [2, 0]
//				  [0, 6]
//				  [1, 4]

		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<Integer>());
		adj.get(0).add(6);
		adj.get(1).add(4);
		adj.get(2).add(0);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(2).add(5);
		adj.get(8).add(7);
		adj.get(8).add(2);
		
		ArrayList<Integer> [] list = createList(n, adj);

//		adj.get(0).add(1);
//		adj.get(1).add(0);
//
//		adj.get(1).add(2);
//		adj.get(2).add(1);
//
//		adj.get(2).add(3);
//		adj.get(3).add(2);
//
//		adj.get(4).add(3);
//		adj.get(3).add(4);
//
//		adj.get(4).add(5);
//		adj.get(5).add(4);
//
//		adj.get(4).add(6);
//		adj.get(6).add(4);
//
//		adj.get(1).add(6);
//		adj.get(6).add(1);

//		adj.get(0).add(1);

//		System.out.println(checkBipartite(list, n) == true ? 1 : 0);
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

	public static ArrayList<Integer>[] createList(int A, ArrayList<ArrayList<Integer>> B) {
		ArrayList<Integer>[] res = new ArrayList[A];
		for (int i = 0; i < res.length; i++) {
			res[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < B.size(); i++) {
			res[B.get(i).get(0)].add(B.get(i).get(1));
			res[B.get(i).get(1)].add(B.get(i).get(0));
		}
		return res;
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
