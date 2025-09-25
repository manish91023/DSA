import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int []candidates={2,3,6,7};
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(candidates, 7, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
