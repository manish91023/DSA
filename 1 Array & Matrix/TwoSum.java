import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int res[]=twoSum(arr,9);
        System.out.println(Arrays.toString(res));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};



    }
}
