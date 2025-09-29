import java.util.*;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        List<String> result = new ArrayList<>();
        backtrack(chess, "", n, 0, result);

        System.out.println("All Solutions:");
        for (String sol : result) {
            System.out.println(sol);
        }
    }

    private static void backtrack(int[][] chess, String qsf, int n, int row, List<String> result) {
        if (row == n) {
            result.add(qsf);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(chess, row, col, n)) {
                chess[row][col] = 1; // place queen
                backtrack(chess, qsf + row + "-" + col + " ", n, row + 1, result);
                chess[row][col] = 0; // backtrack
            }
        }
    }

    private static boolean isSafe(int[][] chess, int row, int col, int n) {
        // check column
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 1) return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 1) return false;
        }

        return true;
    }
}
