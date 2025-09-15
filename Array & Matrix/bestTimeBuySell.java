public class bestTimeBuySell {
    public static void main(String[] args) {
        int stocks[]={7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }

     public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else if(price-minPrice>maxProfit){
                maxProfit=price-minPrice;
            }
        }
        return maxProfit;
    }
}
