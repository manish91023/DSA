import java.util.ArrayList;
import java.util.List;

public class ratInMaze {
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1) {
            printRatInMaze(0, 0, n, maze, visited, "");
        }

   
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void printRatInMaze(int i, int j, int n, int[][] maze, boolean[][] visited, String path) {
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        visited[i][j] = true;

        // Down
        if (isSafePathForRat(i + 1, j, n, visited, maze)) {
            printRatInMaze(i + 1, j, n, maze, visited, path + "D");
        }

        // Left
        if (isSafePathForRat(i, j - 1, n, visited, maze)) {
            printRatInMaze(i, j - 1, n, maze, visited, path + "L");
        }

        // Right
        if (isSafePathForRat(i, j + 1, n, visited, maze)) {
            printRatInMaze(i, j + 1, n, maze, visited, path + "R");
        }

        // Up
        if (isSafePathForRat(i - 1, j, n, visited, maze)) {
            printRatInMaze(i - 1, j, n, maze, visited, path + "U");
        }

        // Backtrack
        visited[i][j] = false;
    }

    private static boolean isSafePathForRat(int i, int j, int n, boolean[][] visited, int[][] maze) {
        return (i >= 0 && j >= 0 && i < n && j < n && maze[i][j] == 1 && !visited[i][j]);
    }
}
