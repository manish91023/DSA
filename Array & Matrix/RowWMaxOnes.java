public class RowWMaxOnes {
    public static void main(String[] args) {
        int[][] matrix={
            {0,0,0,1},
            {0,1,1,1},
            {0,0,0,0},
            {1,1,1,1}
        };
        System.out.println(RowWithMaxOnes(matrix));
    }


    private static int RowWithMaxOnes(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;

        int maxOneIndex=-1;
        int j=col-1;
        for(int i=0;i<row;i++){
            while (j>=0 && matrix[i][j]==1) {
                maxOneIndex=i;
                j--;
            }
        }
        return maxOneIndex;
    }
}
