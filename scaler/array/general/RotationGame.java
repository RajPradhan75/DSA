package datastructures.src.com.scaler.array.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotationGame {
// Right Rotate
	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
		int n; int d ;

		n = sc.nextInt();
		
		d = sc.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		
		rightRotate(A, d, n);
		System.out.println(Arrays.toString(A));
		
		
	}	

//		Scanner scanner = new Scanner(System.in);
//		List<Integer> A = new ArrayList<Integer>();
//		while (scanner.hasNextInt()) {
//			A.add(scanner.nextInt());
//		}
//		List<Integer> A = new ArrayList<Integer>();
//		//1,2,3,4
//		A.add(1);
//		A.add(2);
//		A.add(3);
//		A.add(4);
//	
//		int arrayCount = A.remove(0);
//		int rotations = A.remove(A.size() - 1) % arrayCount;
//		array_rotation(0, A.size(), A);
//		array_rotation(0, rotations, A);
//		array_rotation(rotations, A.size(), A);
//		for (int i = 0; i < A.size(); i++) {
//			System.out.print(A.get(i) + " ");
//		}
//		System.out.println();
//	}
//
//	public static void array_rotation(int start, int end, List<Integer> A) {
//		int i = start;
//		int j = end - 1;
//		while (i < j) {
//			int temp = A.get(i);
//			A.set(i, A.get(j));
//			A.set(j, temp);
//			i++;
//			j--;
//		}
//	}

//	Scanner scanner = new Scanner(System.in);
//	List<Integer> A = new ArrayList<Integer>();
//	while (scanner.hasNextInt()) {
//		A.add(scanner.nextInt());
//	}

		
		static void rotate(int A[], int n) {
			int temp, i;

			temp = A[n - 1];
			for (i = A.length - 1; i > 0; i--) {
				A[i] = A[i - 1];
			}
			A[0] = temp;

		}

		public static void rightRotate(int A[], int d, int n) {
			for (int i = 0; i < d; i++)
				rotate(A, n);
		}

	}


