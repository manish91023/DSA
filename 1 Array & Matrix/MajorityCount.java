public class MajorityCount {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};

         int candidate=0;
        int count=0 ;
        for(int num : nums){
            if(count==0){
                candidate=num;
            }
            count+=(candidate==num)?1:-1;
        }

        System.out.println(candidate);
    }
}
