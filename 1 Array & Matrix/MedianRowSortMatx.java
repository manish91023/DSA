public class MedianRowSortMatx {
    public static void main(String[] args) {
        int arr[][]={
            {1,3,5},
            {2,6,9},
            {3,6,9}
        };
        System.out.println(FindMedianRowSortedMtx(arr));
    }

    private static int FindMedianRowSortedMtx(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            min=Math.min(min, arr[i][0]);
            max=Math.max(max, arr[i][col-1]);
        }

        int desired=(min*max+1)/2;

        while (min<max) {
            int mid=(min+max)/2;
            int place=0;
             // count of numbers <= mid
            for (int i = 0; i < row; i++) {
                place += countLessEqual(arr[i], mid);
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
        
    }
 // Binary search in a row to count numbers <= target
    private static int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
