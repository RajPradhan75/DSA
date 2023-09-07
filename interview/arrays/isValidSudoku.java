package datastructures.src.com.interview.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class isValidSudoku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Input the initial Sudoku board
        int[][] board = {
                {0, 0, 0, 3},
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {4, 0, 0, 0}
        };

        // Print the current board
        System.out.println("Current Sudoku board:");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        // Input the number and row/column indices to validate
        System.out.print("Enter a number to validate (1-9, use 0 for empty): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 9) {
            System.out.println("Invalid number. Please enter a number between 0 and 9.");
            return;
        }

        System.out.print("Enter the row index (0-3): ");
        int rowIndex = scanner.nextInt();
        if (rowIndex < 0 || rowIndex >= board.length) {
            System.out.println("Invalid row index. Please enter a valid row index.");
            return;
        }

        System.out.print("Enter the column index (0-3): ");
        int colIndex = scanner.nextInt();
        if (colIndex < 0 || colIndex >= board[0].length) {
            System.out.println("Invalid column index. Please enter a valid column index.");
            return;
        }

        // Update the board with the user input
        board[rowIndex][colIndex] = number;

        // Check if the updated board is valid
        boolean isValid = isValidSudoku(board);

        if (isValid) {
            System.out.println("Valid move!");
        } else {
            System.out.println("Invalid move.");
        }

        // Print the current board
        System.out.println("Updated Sudoku board:");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }

    public static boolean isValidSudoku(int[][] board) {
        int n = board.length; // Assuming the board is a square grid
        int blockSize = (int) Math.sqrt(n); // Calculate the size of a block

        Set<String> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = board[i][j];
                if (number != 0) {
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + (i / blockSize) + "-" + (j / blockSize)))
                        return false;
                }
            }
        }

        return true;
    }
}
