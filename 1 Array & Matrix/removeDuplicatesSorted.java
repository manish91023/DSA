public class removeDuplicatesSorted {
    public static void main(String[] args) {
        int arr[]={
            0,0,1,1,1,2,2,3,3,4
        };
        System.out.println(removeDuplicatesSortedArr(arr));
    }

    private static int removeDuplicatesSortedArr(int arr[]){
        int len=arr.length;

        int j=0;
        for(int i=0 ;i<len;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
}
