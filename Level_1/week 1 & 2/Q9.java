import java.util.*; // Required for user input
class Q9 {
    public static void main(String[] args) {
        
        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);
        
        // Create a variable named fee and take user input for fee
        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble();
        
        // Create another variable discountPercent and take user input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Compute the discount and assign it to the discount variable
        double discount = (fee * discountPercent) / 100;
        
        // Compute the fee to pay by subtracting the discount from the fee
        double finalFee = fee - discount;
        
        // Display the result following the required O/P format
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        // Close the scanner object
        input.close();
    }
}