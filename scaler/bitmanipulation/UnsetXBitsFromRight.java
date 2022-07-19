package datastructures.src.com.scaler.bitmanipulation;

public class UnsetXBitsFromRight {

	public static void main(String[] args) {
		int A = 25;
		int B = 3;
		System.out.println(solve(A, B));

	}

	public static int solve(int A, int B) {



	        A=A>>B;             //This will loose B bits at the right
	        A=A<<B;             //This will add B 0's at the right
	 
		

		return A;

	}

}
