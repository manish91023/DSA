public class maxSubArrBoundedMax {
    public static void main(String[] args) {
        int nums[]={2,1,4,3};
        System.out.println(numSubarrayBoundedMax(nums, 2, 3));
    }
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        
        return count(nums,right)-count(nums,left-1);
    }
    private static int count(int arr[],int bound){
        int ans=0;
        int curr=0;
        for(int n:arr){
            if(n<=bound){
                curr++;
                ans+=curr;
            }else{
                curr=0;
            }
        }
        return ans;
    }
}
