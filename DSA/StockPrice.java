package dsa.dsRevision.array;
//
//Given an array of integers representing stock price on a single day,
//        find max profit that can be earned by 1 transaction.
//        So you need to find a pair (buyDay,sellDay) where buyDay < = sellDay
//        and it should maximize the profit
public class StockPrice {
    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println(calculateMaxProfit(arr));
    }

    private static int calculateMaxProfit(int[] arr) {
        int maxProfit=Integer.MIN_VALUE;
        int lowestPriceTillDate=arr[0];
        for(int i=0;i< arr.length;i++){
            int profit=0;
            if(arr[i]>lowestPriceTillDate){
                profit=arr[i]-lowestPriceTillDate;
                if (profit>maxProfit)
                    maxProfit=profit;
            }else
                lowestPriceTillDate=arr[i];
        }
        return maxProfit;
    }
}
