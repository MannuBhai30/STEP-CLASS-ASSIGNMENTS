class Q4 {
    public static void main(String[] args) {
        
        // Create variables for cost price and selling price 
        double costPrice = 129;
        double sellingPrice = 191;
        
        // Compute profit
        double profit = sellingPrice - costPrice;
        
        // Compute profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display result using a single print statement with multiline text 
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}