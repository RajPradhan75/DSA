package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class ReverseArray {

	 /* Function to reverse arr[] from
    start to end*/
    static void revereseArray(int arr[],
                    int start, int end)
    {
        int temp;
          
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }    
      
    /* Utility that prints out an
    array on a line */
    static void printArray(int arr[],
                            int n)
    {
        for (int i = 0; i < n; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    }
 
    // Driver code
    public static void main(String args[]) {
         
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, arr.length);
        revereseArray(arr, 0, arr.length-1);
        System.out.print("Reversed array is \n");
        printArray(arr, arr.length);
        
    }

}
