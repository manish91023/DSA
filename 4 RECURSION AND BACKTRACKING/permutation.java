
public class permutation {
    public static void main(String[] args) {
        computePermutation(new int[]{1,2,3}, 0, 2);
    }
    private static void computePermutation(int[] nums,int l,int r){
        if(l==r){
            for(int n:nums){
                System.out.print(n+" ");
            }
            System.out.println();
        }else{
            for(int i=l;i<=r;i++){
                swap(nums,i,l);
                computePermutation(nums, l+1, r);
                swap(nums,i,l);
            }
        }
    }
    private static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
