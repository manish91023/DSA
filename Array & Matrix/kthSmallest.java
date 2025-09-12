public class kthSmallest {
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30},
            {15, 25, 35},
            {27, 29, 37}
        };
        int k = 5;
        System.out.println(k + "th smallest element is " + kthSmallests(matrix, k));
    }

    private static int kthSmallests(int[][] matrix,int k){
        int low=matrix[0][0];
        int n=matrix.length;
        int high=matrix[n-1][n-1];

        while (low<high) {
            int mid=low+(high-low)/2;
            int count =countLessEqual(matrix,mid);

            if(count<k){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }

    private static int countLessEqual(int[][] matrix,int mid){
        int n=matrix.length;
        int count =0;
        int row=n-1;
        int col=0;

        while (row>=0 && col<n) {
            if(matrix[row][col]<=mid){
                count+=row+1;
                col++;
            }else{
                row--;
            }
        }
        return count;
    }
}
