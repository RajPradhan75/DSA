package datastructures.src.com.scaler.advanced.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBiparte {
	public static void main(String[] args) {
		int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
		System.out.println(isBipartite(graph));
	}

	public static boolean isBipartite(int[][] graph) {
		int length = graph.length;
		int[] colors = new int[length];

		for (int i = 0; i < length; i++) {
			if (colors[i] != 0)
				continue;
			Queue<Integer> queue = new LinkedList<>();
			queue.offer(i);
			colors[i] = 1;

			while (!queue.isEmpty()) {
				int cur = queue.poll();
				for (int next : graph[cur]) {
					if (colors[next] == 0) { // node hasn't been colored
						colors[next] = -colors[cur];
						queue.offer(next);
					} else if (colors[next] != -colors[cur])
						return false;
				}
			}
		}
		return true;
	}
}
