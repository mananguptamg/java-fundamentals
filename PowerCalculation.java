// Importing the Scanner class to take user input
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the base value
        System.out.print("Enter the base: ");
        double base = sc.nextDouble(); // Reading base input
        
        // Prompting the user to enter the exponent value
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble(); // Reading exponent input
        
        // Calculating power using the Math.pow() method
        double result = Math.pow(base, exponent);
        
        // Displaying the calculated result with two decimal places
        System.out.printf("Result: %.2f\n", result);
    }
}
