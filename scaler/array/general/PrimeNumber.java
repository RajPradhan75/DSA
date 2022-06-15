package datastructures.src.com.scaler.array.general;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 3;

		checkPrime(n);
	}

	static void checkPrime(int n) {

		// Brute force Approach

//		int count = 0;
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//		}
//
//		if (count == 2) {
//			return true;
//		} else {
//			return false;
//		}

		 

		        int count = 0;

		        for(int i=1; i*i<=n; i++){
		            if(n%i == 0){
		                if(i == n/i)
		                count++;
		                else 
		                count+=2;
		            }
		        }

		        if(count == 2){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    
		

	}

}
