public class maxProdSubArr {
    public static void main(String[] args) {
        int nums[]={-2,0,-1,4,5,3};
         int len = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < len; i++) {
            int curr = nums[i];

            // If current number is negative, swap max and min
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            result = Math.max(result, maxProd);
        }

        System.out.println(result);
    }
}
