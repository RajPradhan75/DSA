package datastructures.src.com.interview;

public class SumOfAllElement {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 1};
        System.out.println(sumOfAll(arr));
    }

    private static int sumOfAll(int[] arr){
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }
}
