public class maximumAndValue {
    public static void main(String[] args) {
        System.out.println(maxAndValue(new int[] {4,8,6,2}));
    }
    private static int maxAndValue(int nums[]){

        int result=0;
        for(int bit=31;bit>=0;bit--){

            int temp=result | (1<<bit);
            int count=0;
            for(int n:nums){
                if((n&temp)==temp){
                    count++;
                }
            }
            if(count>=2){
                result=temp;
            }

        }
        return result;
    }
}
