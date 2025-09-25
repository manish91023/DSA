import java.util.Arrays;

public class twoDifference {
    public static void main(String[] args) {
        int arr[]={90, 70, 20, 80, 50};
        System.out.println(isTwoDifference(arr, 45));
    }

    private static boolean isTwoDifference(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int currDiff=arr[right]-arr[left];
            if(currDiff==target){
                return true;
            }else if(currDiff<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
