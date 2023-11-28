package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices){
        int max = 0,min = prices[0],left=0,right=0;
        for(int i=0;i<prices.length;i++){
            if(prices[left] < prices[right]){
                min =Math.min(min, prices[left]);
                max = Math.max(max, prices[right]-prices[left]);
            } else{
                left = right;
            }
            right++;
        }
        return max;
    }
}
