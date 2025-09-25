public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(MaxConsecutiveOnes(arr));
    }
    private static int MaxConsecutiveOnes(int arr[]){
        int len=arr.length;
        int maxOne=0;
        int currMax=0;
        for(int i=0;i<len;i++){
            if(arr[i]==1){
                currMax+=1;
                maxOne=Math.max(currMax, maxOne);
            }else{
                currMax=0;
            }
        }
        return maxOne;
    }
}
