package datastructures.src.com.interview;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};  // 2,5,17
        findLeaders(arr);
    }

    public static void findLeaders(int[] arr){
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] > maxSoFar){
                maxSoFar = arr[i];
                System.out.print(maxSoFar + " ");
            }
        }
    }
}
