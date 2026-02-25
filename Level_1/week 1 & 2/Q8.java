import java.util.*; // Required to take user input 
class Q8 {
    public static void main(String[] args) {
        
        // Create Scanner Object to take user input from Standard Input
        Scanner input = new Scanner(System.in);
        
        // Create a variable km and assign type as double 
        double km;
        
        // Prompt the user for input
        System.out.print("Enter distance in kilometers: ");
        
        // Use Scanner Object to take user input for km
        km = input.nextDouble(); 
        
        // Use 1 mile = 1.6 km formula to calculate miles 
        double miles = km / 1.6;
        
        // Display the output in the required format
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the scanner
        input.close();
    }
}