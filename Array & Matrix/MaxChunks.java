class MaxChunks{
public static void main(String[] args) {
    System.out.println(maxChunksToSorted(new int[]{1,0,2,3,4}));
}
 public static int maxChunksToSorted(int[] arr) {
        int chunks=0;
        int maxSoFar=0;
        for(int i=0;i<arr.length;i++){
            maxSoFar=Math.max(maxSoFar,arr[i]);
             if (maxSoFar == i) {
                chunks++;
            }
        }
        return chunks;
    }
}