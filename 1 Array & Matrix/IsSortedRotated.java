public class IsSortedRotated {
    public static void main(String[] args) {
        
    
    int arr[]={
       2,1, 3,4,5
    };
    System.out.println(IsArrSortedRotated(arr));
}

    private static boolean IsArrSortedRotated(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
            }
        }
        return count<=1;
    }
}
