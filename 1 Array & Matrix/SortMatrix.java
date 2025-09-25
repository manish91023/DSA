import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48}
        };
        System.out.println(Arrays.deepToString(matrix));
        SortMat(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    private static void SortMat(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;

        int k=0;
        int matSize=row*col;
        int[] oneDArr=new int[matSize];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                oneDArr[k++]=matrix[i][j];
            }
        }

        Arrays.sort(oneDArr);
        k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=oneDArr[k++];
            }
        }
    }
}
