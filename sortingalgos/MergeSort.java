package datastructures.src.com.sortingalgos;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 4, 1, 9, 6, 3, 7};
        mergeSort(array);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void mergeSort(int[] array) {

        if (array.length <= 1)
            return;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);

    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

    }

}
