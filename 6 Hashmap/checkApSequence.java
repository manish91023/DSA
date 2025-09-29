import java.util.Arrays;
import java.util.HashSet;

public class checkApSequence {
    public static void main(String[] args) {
        // System.out.println(isFormedAp(new int[]{12, 40, 11, 20}));
        System.out.println(isFormedApByHashMap(new int[]{0,4,8,2}));
    }

    private static boolean isFormedApByHashMap(int[]arr){
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            max=Math.max(max, i);
            min=Math.min(i, min);
            set.add(i);
        }
        int count=0;
        int  commonDiff=(max-min)/(n-1);
        while (set.contains(max)) {
            count++;
            max-=commonDiff;
        }
        if (count==n) return true;

        return false;
    }








    //basic idea of mind so now we can improve this 
    private static boolean isFormedAp(int[]arr){
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])!=diff){
                return false;
            }
        }
        return true;
    }
}
