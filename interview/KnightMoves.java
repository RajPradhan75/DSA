package datastructures.src.com.interview;

public class KnightMoves {

    public static final int n = 4;
    public static final int m = 4;

    static int findPossibleMoves(int[][] mat, int p, int q) {

        // all possible moves of knight

        int[] X = {2, -2, 2, -2, 1, -1, 1, -1};
        int[] Y = {1, 1, -1, -1, 2, 2, -2, -2};

        int count = 0;

        //check move is valid or not

        for (int i = 0; i < 8; i++) {

            //position of knight after move
            int x = p + X[i];
            int y = q + Y[i];

            //valid moves

            if (x >= 0 && y >= 0 && x < n && y < m
                    && mat[x][y] == 0)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] mat = {{1, 0, 1, 0},
                       {0, 1, 1, 1},
                       {1, 1, 0, 1},
                       {0, 1, 1, 1}

        };

        int p = 2, q = 2;

        System.out.println(findPossibleMoves(mat, p, q));
    }


}
