import java.util.Arrays;

public class singleNumberIII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateSingleNumber(new int[]{1,1,3,2,5,2})));
        
    }
    private static int[] calculateSingleNumber(int[]nums){
        int all_xor=0;
        for(int n:nums){
            all_xor ^=n;
        }

        int diff_bit=all_xor & (-all_xor);
        int a=0;
        int b=0;
        for(int n:nums){
            if((n& diff_bit)==0){
                a^=n;
            }else{
                b^=n;
            }
        }
        return new int[]{a,b};
    }
}
