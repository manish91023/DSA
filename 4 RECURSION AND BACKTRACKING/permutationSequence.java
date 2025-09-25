import java.util.ArrayList;
import java.util.List;

public class permutationSequence {
    

    public static void main(String[] args) {
      System.out.println(getPermutation(3, 5));
       
    }
     public static String getPermutation(int n, int k) {
        int fact=1;
        List<Integer>nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
            fact*=i;
        }
        k=k-1;
        StringBuilder sb = new StringBuilder();
        for(int i=n;i>=1;i--){
            fact=fact/i;
            int index=k/fact;
            sb.append(nums.remove(index));
            k%=fact;
        }
        return sb.toString();
        
    }

    
}
