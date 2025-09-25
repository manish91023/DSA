import java.util.Arrays;

public class MoveZeroToRight {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        MoveZeroToRightArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void MoveZeroToRightArr(int arr[]){
        int len=arr.length;
        int j=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while (j<len) {
            arr[j++]=0;
        }
    }
}
