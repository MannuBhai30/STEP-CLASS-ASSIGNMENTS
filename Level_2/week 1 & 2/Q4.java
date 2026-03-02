// 4. Write a program to find the distance in yards and miles for the distance provided by the user in feet
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        input.close();
    }
}