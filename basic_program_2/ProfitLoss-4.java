public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int profitPercent = (profit * 100) / costPrice;

        System.out.println("Cost Price" + costPrice + "Selling Price" + sellingPrice + "Profit is" + profit + "the Profit Percentage is " + profitPercent);
    }
}