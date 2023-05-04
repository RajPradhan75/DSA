package datastructures.src.com.scaler.advanced.graphs;

public class NoOfIslands {
	public static void main(String[] args) {
//		Input: grid = [
//		               ['1','1','0','0','0'],
//		               ['1','1','0','0','0'],
//		               ['0','0','1','0','0'],
//		               ['0','0','0','1','1']
//		             ]
//		             Output: 3

		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println(numOfIsLands(grid));

	}

	public static int numOfIsLands(char[][] grid) {
		// If the grid is empty, there are no islands
		if (grid == null || grid.length == 0)
			return 0;

		int m = grid.length;
		int n = grid[0].length;
		// Boolean matrix to keep track of visited cells
		boolean[][] visited = new boolean[m][n];
		int count = 0; // no of islands
		// Traverse the grid and perform DFS on each unvisited cell
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && grid[i][j] == '1') {
					dfs(visited, grid, i, j);
					count++;
				}
			}
		}

		return count;

	}

	public static void dfs(boolean[][] visited, char[][] grid, int i, int j) {
		// Check if the current cell is within the grid and unvisited
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && !visited[i][j] && grid[i][j] == '1') {
			// Mark current cell as visited
			visited[i][j] = true;
			// Recur for all adjacent cells
			dfs(visited, grid, i + 1, j);
			dfs(visited, grid, i - 1, j);
			dfs(visited, grid, i, j - 1);
			dfs(visited, grid, i, j + 1);

		}
	}

}
