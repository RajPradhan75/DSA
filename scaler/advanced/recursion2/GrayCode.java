package datastructures.src.com.scaler.advanced.recursion2;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	static int num = 0;

	public static void main(String[] args) {
		int A = 2;
	
	
		System.out.println(grayCode(A));
	}



	private static List<Integer> grayCode(int A) {
		ArrayList<Integer> res = new ArrayList<>();
		
		computeGrayCode(res, A);

		return res;
	}

	private static void computeGrayCode(ArrayList<Integer> res, int a) {

		if (a == 0) {

			res.add(num);

			return;

		}

		computeGrayCode(res, a - 1);

		num = num ^ (1 << (a - 1));

		computeGrayCode(res, a - 1);

	}

}
