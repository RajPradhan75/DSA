package datastructures.src.com.scaler.advanced.queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PerfectNumber {

	public static void main(String[] args) {
		int A = 3;
		System.out.println(solve(A));
	}

	private static String solve(int A) {

		Deque<String> dq = new ArrayDeque<>();
		dq.addLast("1");
		dq.addLast("2");

		List<String> series = new ArrayList<>();

		while (A > 0) {
			StringBuilder sb = new StringBuilder();
			String temp = dq.peekFirst();
			String temp1 = sb.append(temp).reverse().toString();
			dq.removeFirst();
			String x = temp + "1";
			String y = temp + "2";
			dq.addLast(x);
			dq.addLast(y);
			series.add(temp + temp1);
			sb.delete(0, sb.length() + 1);
			A--;
		}
		return series.get(series.size() - 1);
	}

}
