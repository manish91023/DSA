import java.util.Arrays;

public class MinPlatform {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minNoPlatform(arr, dep));
    }

    private static int minNoPlatform(int arr[],int[]dep){
        int n=arr.length;
        int res=0;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int count=0;
        int j=0;
        for(int i=0;i<n;i++){
            while (j<n && arr[i]>dep[j]) {
                count--;
                j++;
            }
            count++;
            res=Math.max(res, count);
        }
        return res;

    }
}
