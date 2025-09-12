import java.util.Arrays;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateBy90(mat);
        printMatrix(mat);
    }

    // Function to rotate the matrix by 90 degrees clockwise
    private static void rotateBy90(int[][] mat) {
        int n = mat.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Helper function to print the matrix
    private static void printMatrix(int[][] mat) {
        System.out.println(Arrays.deepToString(mat));
    }
}
