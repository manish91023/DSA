import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GridIllumination {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gridIllumination(5, new int[][]{{0,0},{4,4}}, new int[][]{{1,1},{1,1}})));
    }
    public static int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> dig = new HashMap<>();
        Map<Integer, Integer> antiDig = new HashMap<>();

        Set<Long> lampset = new HashSet<>();

        for (int[] l : lamps) {
            int r = l[0], c = l[1];
            long key = ((long) r << 32) + c;

            if (lampset.contains(key)) continue;
            lampset.add(key);

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            dig.put(r - c, dig.getOrDefault(r - c, 0) + 1);
            antiDig.put(r + c, antiDig.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];
        int idx = 0;

        int[][] dirs = {
            {0, 0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        for (int[] q : queries) {
            int r = q[0], c = q[1];

          
            if (row.getOrDefault(r, 0) > 0 ||
                col.getOrDefault(c, 0) > 0 ||
                dig.getOrDefault(r - c, 0) > 0 ||
                antiDig.getOrDefault(r + c, 0) > 0) {
                ans[idx++] = 1;
            } else {
                ans[idx++] = 0;
            }

      
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue; 

                long key = ((long) nr << 32) + nc;
                if (lampset.contains(key)) {
                    lampset.remove(key);

                    row.put(nr, row.get(nr) - 1);
                    col.put(nc, col.get(nc) - 1);
                    dig.put(nr - nc, dig.get(nr - nc) - 1);
                    antiDig.put(nr + nc, antiDig.get(nr + nc) - 1);
                }
            }
        }
        return ans;
    }
}


