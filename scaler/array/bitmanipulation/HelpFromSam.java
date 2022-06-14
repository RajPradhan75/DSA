package datastructures.src.com.scaler.array.bitmanipulation;

public class HelpFromSam {
	
	
	public static void main(String[] args) {
		
		int A = 5;
		System.out.println(A);

		
	}
	
	public static int solve(int A) {
		
		int count = 0;
		
		

		
		while(A!=0) {
			count += (A & 1);
			A = A>>>1;
		}
		
		
		
		return count;
		
	}

	

}
