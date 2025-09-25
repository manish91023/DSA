

public class maxConsecutiveOne {
   public static void main(String[] args) {
    int arr[]={0,0,1,1,1,0,0,1};
    System.out.println(maxConsecutiveOneIII(arr, 2));
   } 
   private static int maxConsecutiveOneIII(int arr[],int k){
        int zero=0;
        int left=0;
        int right=0;
        int maxLen=0;
        while (right<arr.length) {
            if(arr[right]==0){
                zero++; 
            }
            while (zero>k) {
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }

            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
    return maxLen;
   }
}
