import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public static void main(String[] args) {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 2));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 1, 1));
        System.out.println(smallBrickCrossed(wall ));
    }
    private static int smallBrickCrossed(List<List<Integer>> wall){
        int maxEdges=0;
        Map<Integer,Integer>map=new HashMap<>();

        for(List<Integer>row:wall){
            int sum=0;
            for(int i=0;i<row.size()- 1;i++){
                sum+=row.get(i);
                map.put(sum,map.getOrDefault(sum, 0)+1);
                maxEdges=Math.max(maxEdges,map.get(sum));
            }
        }
        return wall.size()-maxEdges;
    }
}
