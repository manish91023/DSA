public class firstMissingPositive {
    public static void main(String[] args) {
        int nums[]={7,8,9,11};
        System.out.println(firstMissingPosi(nums));
    }

    public static int firstMissingPosi(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            while(nums[i]>=1 && nums[i]<=len && nums[nums[i]-1]!=nums[i]){
                 // swap nums[i] with nums[nums[i]-1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

         // Step 2: Find first index where nums[i] != i+1
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len+1;
    }
}
