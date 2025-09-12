public class Kadanes {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArrSum(arr));
    }
    private static int MaxSubArrSum(int arr[]){
        int maxSum=arr[0];
        int currMaxSum=arr[0];
        for(int i=1;i<arr.length;i++){
             currMaxSum=Math.max(arr[i],currMaxSum +arr[i]);
             maxSum=Math.max(currMaxSum, maxSum);
        }

        return maxSum;
    }

}
