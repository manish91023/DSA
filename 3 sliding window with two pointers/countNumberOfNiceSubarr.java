import java.util.HashMap;
import java.util.Map;

public class countNumberOfNiceSubarr {
    public static void main(String[] args) {
        System.out.println(niceSubarrayCount(new int[]{1,1,2,1,1 }, 3));
    }
    private static int niceSubarrayCount(int[] nums,int k){
        int res=0;
        int prevSum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int n:nums){
            prevSum+=n%2;
            if(map.containsKey(prevSum-k)){
                res+=map.get(prevSum-k);
            }

            map.put(prevSum,map.getOrDefault(prevSum,0)+1);
        }
        return res;
    }
}
