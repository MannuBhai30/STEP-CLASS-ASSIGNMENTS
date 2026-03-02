// 2. Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        // Since 1 inch = 2.54 cm, 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqInches = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqInches + " and sq cm is " + areaSqCm);
        
        input.close();
    }
}