package datastructures.src.com.sdesheet.arrays1;

import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

public class PascalTriangle {

	public static void main(String[] args) {

		int numRows = 5;

		System.out.println(solve(numRows));
	}

	public static List<List<Integer>> solve(int numRows) {

		List<List<Integer>> triangle = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {

			List<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					list.add(1);
				} else {
					List<Integer> prev_row = triangle.get(i - 1);
					int a = prev_row.get(j - 1);
					int b = prev_row.get(j);
					list.add(a + b);
				}
			}

			triangle.add(list);

		}

		return triangle;

	}

}
