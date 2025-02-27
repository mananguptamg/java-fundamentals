import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declaring two integer variables to store user input
        int firstNumber;
        int secondNumber;
        
        // Prompting the user to enter the first number
        System.out.println("Enter first number");
        firstNumber = sc.nextInt(); // Reading first integer input
        
        // Prompting the user to enter the second number
        System.out.println("Enter second number");  
        secondNumber = sc.nextInt(); // Reading second integer input
        
        // Displaying the sum of the two numbers
        System.out.print("The addition of numbers is " + (firstNumber + secondNumber));
    }
}
