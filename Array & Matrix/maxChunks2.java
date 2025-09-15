import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maxChunks2 {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{1,1,0,0,1}));
    }

     public static int maxChunksToSorted(int[] arr) {
        int sortedCopy[]=arr.clone();
        Arrays.sort(sortedCopy);
        int n=arr.length;
        int chunks=0;

        Map<Integer,Integer>countMap=new HashMap<>();

        for(int i=0;i<n;i++){
            // increment from
            countMap.put(arr[i],countMap.getOrDefault(arr[i],0)+1);
            if(countMap.get(arr[i])==0){
                countMap.remove(arr[i]);
            }

            // decrement from sorted 
            countMap.put(sortedCopy[i],countMap.getOrDefault(sortedCopy[i],0)-1);
            if(countMap.get(sortedCopy[i])==0){
                countMap.remove(sortedCopy[i]);
            }

            if(countMap.isEmpty()){
                chunks++;
            }

        }

        return chunks;
    }
}
