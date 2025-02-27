// Importing the Scanner class to take user input
import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter three numbers
        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble(); // Reading first number

        System.out.print("Enter second number: ");
        double secondNumber = sc.nextDouble(); // Reading second number

        System.out.print("Enter third number: ");
        double thirdNumber = sc.nextDouble(); // Reading third number

        // Calculating the average using the formula: (firstNumber + secondNumber + thirdNumber) / 3
        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        // Displaying the calculated average
        System.out.printf("The average of the three numbers is: %.2f\n", average);
    }
}
