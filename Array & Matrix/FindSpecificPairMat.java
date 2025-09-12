public class FindSpecificPairMat {
    public static void main(String[] args) {
         int mat[][] = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 6, 1, 3},
            {-4, -1, 1, 7, -6},
            {0, -4, 10, -5, 1}
        };

        System.out.println(FindSpecificPairMatrix(mat));
    }

    private static int FindSpecificPairMatrix(int arr[][]){

        int n=arr.length;

        int maxarr[][]=new int[n][n];
        maxarr[n-1][n-1]=arr[n-1][n-1];
        //fill last row
        for(int i=n-2;i>=0;i--){
            maxarr[n-1][i]=Math.max(arr[n-1][i], maxarr[n-1][i+1]);
        }
        // fill last cols
        for(int i=n-2;i>=0;i--){
            maxarr[i][n-1]=Math.max(arr[i][n-1], maxarr[i+1][n-1]);
        }
        
        int maxValue=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                int candidate=maxarr[i+1][j+1]-arr[i][j];
                 maxValue=Math.max(maxValue, candidate);

                 maxarr[i][j]=Math.max(arr[i][j], Math.max(maxarr[i+1][j], maxarr[i][j+1]));
            }
        }
        return maxValue;
    }
}
