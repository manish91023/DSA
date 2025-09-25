import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {
        int arr[]={0, -1, 2, -3, 1};
        System.out.println(isTwoSum(arr, -2));
    }

    private static boolean isTwoSum(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int currSum=arr[left]+arr[right];
            if(currSum==target){
                return true;
            }else if(currSum<target){
                left++;
            }else{
                right--;
            }

        }
        return false;
    }
}