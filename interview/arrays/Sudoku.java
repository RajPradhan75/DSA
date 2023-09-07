package datastructures.src.com.interview.arrays;

import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {0, 0, 0, 3},
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {4, 0, 0, 0}};

        System.out.println("Please select the value:");
        int inputNum = sc.nextInt();
        System.out.println("Please select the row position (1-based):");
        int row = sc.nextInt() - 1;
        System.out.println("Please select the column position (1-based):");
        int col = sc.nextInt() - 1;
        if (validateInput(arr, inputNum, row, col) && rowCheck(arr, inputNum, row, col)
                && colCheck(arr, inputNum, row, col)) {
            System.out.println("Please change the number.");
        } else {
            System.out.println("Input number is valid.");
        }
    }

    private static boolean validateInput(int[][] arr, int num, int row, int col) {
        return findNum(arr, num, row - 1, col) || findNum(arr, num, row, col + 1) ||
                findNum(arr, num, row + 1, col) || findNum(arr, num, row, col - 1) ||
                findNum(arr, num, row - 1, col - 1) || findNum(arr, num, row + 1, col + 1) ||
                findNum(arr, num, row - 1, col + 1) || findNum(arr, num, row + 1, col - 1);
    }

    private static boolean findNum(int[][] arr, int num, int row, int col) {
        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length) {
            return false;
        }
        return arr[row][col] == num;
    }

    public static boolean rowCheck(int[][] matrix, int value, int rowNumber, int colNumber) {
        // Check the same row
        for (int col = 0; col < matrix[rowNumber].length; col++) {
            if (matrix[rowNumber][col] == value) {
                return true;
            }
        }


        return false; // Value not found in the same row or column
    }

    public static boolean colCheck(int[][] matrix, int value, int rowNumber, int colNumber) {
        // Check the same column
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][colNumber] == value) {
                return true;
            }
        }


        return false; // Value not found in the same row or column
    }


}



