package datastructures.src.com.scaler.array.general;

import java.util.Scanner;

public class SearchElement {
	
 // You are given an integer T (number of test cases). 
//	You are given array A and an integer B for each test case. 
//	You have to tell whether B is present in array A or not.
	
	 public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		        int T = sc.nextInt();
		        int i,j;
		        boolean flag;
		   

		        for(j=0;j<T;j++){
		            int A = sc.nextInt();
		            int [] arr = new int [A];
		            for(i=0;i<A;i++){
		                arr[i]=sc.nextInt();
		            }
		            int B = sc.nextInt();
		            flag=false;
		            for(i=0;i<A;i++){
		                if(B==arr[i]){
		                    flag=true;
		                }
		            }
		            if(flag)
		                System.out.println(1);
		            else
		                System.out.println(0);
		        }
		    }

}
