

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(ContainerWithMostWaters(height));
    }
    private static int ContainerWithMostWaters(int[] height){
        int mostWater=0;
        int left=0;
        int right=height.length-1;

        while (left<right) {
            int width=right-left;
            int water=Math.min(height[left], height[right])*width;
            mostWater=Math.max(mostWater, water);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return mostWater;



    }
}
