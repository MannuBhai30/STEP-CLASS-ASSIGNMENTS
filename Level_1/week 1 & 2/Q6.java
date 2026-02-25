class Q6 {
    public static void main(String[] args) {
        
        // Create a variable named fee and assign 125000 to it
        double fee = 125000;
        
        // Create another variable discountPercent and assign 10 to it
        double discountPercent = 10;
        
        // Compute discount and assign it to the discount variable
        double discount = (fee * discountPercent) / 100;
        
        // Compute final fee by subtracting the discount from the fee
        double finalFee = fee - discount;
        
        // Display the result following the required O/P format 
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}