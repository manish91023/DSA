public class returnSingleNum {
    public static void main(String[] args) {
        int arrs[]={1,2,4,1,5,4,5};
        int res=0;
        for(int arr:arrs){
            res^=arr;
        }
        System.out.println(res);
    }
}
