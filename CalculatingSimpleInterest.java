// Importing the Scanner class to take user input
import java.util.Scanner;

public class CalculatingSimpleInterest {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the principal amount
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble(); // Reading principal amount

        // Prompting the user to enter the rate of interest (in percentage)
        System.out.print("Enter Rate of Interest (in %): ");
        double rate = sc.nextDouble(); // Reading interest rate

        // Prompting the user to enter the time duration (in years)
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble(); // Reading time period

        // Calculating Simple Interest using the formula: (P × R × T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the calculated Simple Interest
        System.out.printf("Simple Interest: ", simpleInterest);
    }
}

