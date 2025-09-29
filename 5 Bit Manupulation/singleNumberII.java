
public class singleNumberII {
    public static void main(String[] args) {
        System.out.println(singleNumberIISolution(new int[] {2,2,4,2}));
    }
    private static int singleNumberIISolution(int nums[]){
        int one=0;
        int two=0;
        for(int n:nums){
            one=(one^n) & ~two;
            two=(two^n) & ~one;
        }
        return one;
    }
}
