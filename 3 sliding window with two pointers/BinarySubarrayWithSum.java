import java.util.HashMap;
import java.util.Map;

public class BinarySubarrayWithSum {
    public static void main(String[] args) {
        System.out.println(BinarySubarraysWithSum(new int[]{1,0,1,0,1}, 2));
    }
    private static int BinarySubarraysWithSum(int arr[],int k){
        int prevSum=0;
        int result=0;
        
        Map<Integer,Integer>frq=new HashMap<>();
        frq.put(0, 1);

        for(int f:arr){
            prevSum+=f;
            if(frq.containsKey(prevSum-k)){
                result+=frq.get(prevSum-k);
            }
            frq.put(prevSum, frq.getOrDefault(prevSum,0)+1);
        }
        return result;
    }
}
