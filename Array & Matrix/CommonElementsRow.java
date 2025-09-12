import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonElementsRow {
    public static void main(String[] args) {
                int mat[][] = {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9}
        };
        printCommonEleAllRow(mat);
    }

    private static void printCommonEleAllRow(int[][]mat){
        int row=mat.length;
        int col=mat[0].length;

        Map<Integer,Integer> map =new HashMap<>();
        // first row
        for(int i=0;i<col;i++){
            map.put(mat[0][i],1);
        }

        // process remaining rows
        for(int i=1;i<row;i++){
            Set<Integer> seen=new HashSet<>();
            for(int j=0;j<col;j++){
                int val=mat[i][j];
                if(map.containsKey(val) && map.get(val) == i && !seen.contains(val)){
                    map.put(val, i+1);
                    seen.add(val);
                }
            }
        }

        System.out.print("Common elements: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == row) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
