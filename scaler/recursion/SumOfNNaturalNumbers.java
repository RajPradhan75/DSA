package datastructures.src.com.scaler.recursion;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {

		int N = 10;

		System.out.println(sum(N));

	}

	public static int sum(int N) {

		if (N == 1)
			return 1;

		return sum(N - 1) + N;

	}
}
