package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.List;

public class Batches {
	public static void main(String[] args) {

		int A = 7;
		int[] B = { 1, 6, 7, 2, 9, 4, 5 };
		int[][] C = { { 1, 2 }, { 2, 3 }, { 5, 6 }, { 5, 7 } };
		int D = 12;
		System.out.println(solve(A, B, C, D));
	}

	@SuppressWarnings("unchecked")
	public static int solve(int A, int[] B, int[][] C, int D) {
		List<Integer>[] graph = new ArrayList[A + 1];
		for (int i = 1; i <= A; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		boolean[] visited = new boolean[A + 1];
		int count = 0;

		for (int[] relation : C) {
			int x = relation[0], y = relation[1];
			graph[x].add(y);
			graph[y].add(x);
		}

		for (int i = 1; i <= A; i++) {
			if (!visited[i]) {
				int strength = 0;
				ArrayList<Integer> stack = new ArrayList<Integer>();
				stack.add(i);
				while (!stack.isEmpty()) {
					int node = stack.remove(stack.size() - 1);
					if (!visited[node]) {
						visited[node] = true;
						strength += B[node - 1];
						stack.addAll(graph[node]);
					}
				}
				if (strength >= D)
					count++;
			}
		}

		return count;
	}

	// The time complexity of the solution is O(N+M) and Space O(N+M)
}
