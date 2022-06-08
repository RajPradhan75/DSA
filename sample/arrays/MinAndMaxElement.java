package datastructures.src.com.sample.arrays;

import java.util.Scanner;

public class MinAndMaxElement {

//	static class Pair {
//		int min;
//		int max;
//	}
//
//	static Pair getMinMax(int[] arr, int n) {
//		Pair minmax = new Pair();
//		// one elementt
//		if (n == 1) {
//			minmax.min = arr[0];
//			minmax.max = arr[0];
//			return minmax;
//		}
//		// more than one element
//		if (arr[0] > arr[1]) {
//			minmax.min = arr[1];
//			minmax.max = arr[0];
//		} else {
//			minmax.min = arr[0];
//			minmax.max = arr[1];
//		}
//		//remaining element
//		for (int i = 2; i < n; i++) {
//			if (arr[i] > minmax.max) {
//				minmax.max = arr[i];
//
//			} else if (arr[i] < minmax.min) {
//				minmax.min = arr[i];
//			}
//		}
//		return minmax;
//	}
//
//	public static void main(String[] args) {
//		int arr[] = { 5, 1, 2 ,3 ,4 ,5};
//		int n = arr.length;
//		Pair minmax = getMinMax(arr, n);
//		System.out.printf("\nMinimum element is %d ", minmax.min);
//		System.out.printf("\nMaximum element is %d", minmax.max);
//	}
	
	
	public static void main(String[] args) {

		int N;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		N=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] A = new int[N];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<N; i++)  
		{  
		//reading array elements from the user   
		A[i]=sc.nextInt();  
		}  
    		Pair minmax = getMinMax(A, N);
    		System.out.print( minmax.min+" ");
    	
   		System.out.print( minmax.max);
}

  static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int[] A,int N){
        Pair minmax= new Pair();

        if(N == 1){
            minmax.min = A[0];
            minmax.max = A[0];
            return minmax;
        }

        if(A[0]>A[1]){
            minmax.min = A[1];
            minmax.max = A[0];
        }else{
            minmax.min = A[0];
            minmax.max = A[1];
        }

        for(int i = 2; i<N; i++){
            if(A[i] < minmax.min){
                minmax.min = A[i];

            }else if(A[i]>minmax.max){
                minmax.max = A[i];
            }

            
        }
         return minmax;
    }
  

}


//TC:0(n)
//SC:0(1)