import java.util.*; // Required for user input
class Q10 {
    public static void main(String[] args) {
        
        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for height in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        // Convert total cm to total inches
        double totalInches = heightCm / 2.54;
        
        // Convert total inches to feet and remaining inches
        int feet = (int) (totalInches / 12); 
        double remainingInches = totalInches % 12;
        
        // Display the output in the required format
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches); 
        // Close the scanner
        input.close();
    }
}