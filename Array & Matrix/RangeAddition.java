import java.util.Arrays;

public class RangeAddition {
    public static int[] getModifiedArray(int n, int[][] updates) {
        int[] arr = new int[n];

        // Step 1: Apply boundary updates
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            int inc = update[2];

            arr[start] += inc;
            if (end + 1 < n) {
                arr[end + 1] -= inc;
            }
        }

        // Step 2: Compute prefix sum to get final values
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] updates = { {1, 3, 2}, {2, 4, 3}, {0, 2, -2} };

        int[] result = getModifiedArray(n, updates);
        System.out.println(Arrays.toString(result)); // Output: [-2, 0, 3, 5, 3]
    }
}
