public class SerchInTwoDMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,4,6,7},
            {11,15,64,344},
            {345,432,454,4304}
        };
        System.out.println(Search_In_2d(arr, 4304));
    }

    private static boolean Search_In_2d(int arr[][],int target){
        int row=arr.length;
        int col=arr[0].length;

        int low=0;
        int high=row*col-1;

        while (low<=high) {
            int mid=(low+high)/2;
            int midVal=arr[mid/col][mid%col];
            if(midVal==target){
                return true;
            }else if(midVal<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

            
        }
        return false;
    }
}
