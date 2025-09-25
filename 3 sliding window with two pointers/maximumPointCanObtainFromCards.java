
public class maximumPointCanObtainFromCards {
    public static void main(String[] args) {
        System.out.println(maximumPointCanObtainFromCard(new int[]{1,2,3,4,5,6,1}, 3));
    }
    private static int maximumPointCanObtainFromCard(int[] cards,int k){
        int n=cards.length;
        int total=0;
        for(int c:cards) total+=c;
        if(n==k) return total;

        int windowSize=n-k;
        int windowSum=0;

        for(int i=0;i<windowSize;i++){
            windowSum+=cards[i];

        }
        int minWindowSum=windowSum;
        for(int i=windowSize;i<n;i++){
            windowSum+=cards[i]-cards[i-windowSize];
            minWindowSum=Math.min(minWindowSum, windowSum);

        }

        return total-minWindowSum;
    }
}
