package datastructures.src.com.sortingalgos;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(array);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }

    private static void quickSortRecursive(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSortRecursive(array, low, pivot - 1);
            quickSortRecursive(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
