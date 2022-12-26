package datastructures.src.com.scaler.advanced.graphs;

public class NumberOfIslands {

	public static void main(String[] args) {

		int[][] grid = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };

		System.out.println(solve(grid));
	}

	public static int solve(int[][] grid) {

		int count = 0;
		int row = grid.length;
		int col = grid[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1) {
					count++;
					dfs(i, j, grid.length, grid[0].length, grid);
				}
			}
		}
		return count;
	}

	public static void dfs(int deltarow, int deltacol, int row, int col, int[][] grid) {

		if (deltarow < 0 || deltacol < 0 || deltarow >= row || deltacol >= col || grid[deltarow][deltacol] != 1) {
			return;
		}
		grid[deltarow][deltacol] = -1;
		dfs(deltarow - 1, deltacol, row, col, grid);
		dfs(deltarow + 1, deltacol, row, col, grid);
		dfs(deltarow, deltacol - 1, row, col, grid);
		dfs(deltarow, deltacol + 1, row, col, grid);
		dfs(deltarow - 1, deltacol - 1, row, col, grid);
		dfs(deltarow - 1, deltacol + 1, row, col, grid);
		dfs(deltarow + 1, deltacol - 1, row, col, grid);
		dfs(deltarow + 1, deltacol + 1, row, col, grid);

	}

}
