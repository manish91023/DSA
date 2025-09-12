import java.util.Arrays;

public class SquareSortedArr {
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        SquareSortedArray(arr);
    }

    private static void SquareSortedArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int data=arr[i];
            arr[i]=data*data;

        }
        System.out.println("squared array :");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted squared array");
        System.out.println(Arrays.toString(arr));
    }
}
