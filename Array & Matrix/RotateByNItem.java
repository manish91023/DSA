import java.util.Arrays;

public class RotateByNItem {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        RotateArrayByNEle(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void RotateArrayByNEle(int[] arr,int k){

        int len=arr.length;
        k=k%len;

        // rotating first half
        ReverseArr(arr,0,(len-k-1));
        // rotate second half
        ReverseArr(arr, (len-k), len-1);
        // rotate full arrr
        ReverseArr(arr, 0, len-1);

    }
    private static void ReverseArr(int arr[],int low,int high){
        while (low<high) {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }
}
