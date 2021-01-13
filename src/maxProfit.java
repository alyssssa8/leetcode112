public class maxProfit {

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) { // the need check the size of the prices.
            return 0;
        }
        int theMax = 0;
        int theMin = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (theMin < prices[i]){
                theMax = Math.max(theMax, prices[i]-theMin);
            }
            theMin = Math.min(theMin, prices[i]);
        }
        return theMax;
    }
}
