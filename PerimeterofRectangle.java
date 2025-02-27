// Importing the Scanner class to take user input
import java.util.Scanner;

class PerimeterofRectangle {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble(); // Reading length input
        
        // Prompting the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble(); // Reading width input
        
        // Calculating the perimeter of the rectangle using the formula: 2 × (length + width)
        double perimeter = 2 * (length + width);
        
        // Displaying the calculated perimeter
        System.out.printf("The perimeter of the rectangle is: ", perimeter);
    }
}
