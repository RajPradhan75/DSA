	package datastructures.src.com.scaler.array.mathandarrays;

public class MajorityElements {
	
	
	public static void main(String[] args) {
		int [] A = {2, 1, 2};
		
		System.out.println(solve(A));
	}
	
	public static int solve(int []A) {
		
		int majority = A[0], count = 1, occurrence = 0;
		
		for(int i = 1 ; i<A.length; i++) {
			
			if(count == 0) {
				count++;
				majority = A[i];
			}else if(majority == A[i]) {
				count++;
			}else count -- ;
		}
		
	    for(int i = 0; i<A.length ; i++){
            if(A[i] == majority){
                occurrence++;
            }
        }

        if(occurrence > A.length/2)
         return majority;
        else
         return -1; 
	}

}
