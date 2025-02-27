// Importing the Scanner class to take user input
import java.util.Scanner;

class KilometertoMilesConversion{
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble(); // Reading distance in kilometers

        // Conversion formula: Miles = Kilometers * 0.621371
        double miles = kilometers * 0.621371;

        // Displaying the converted distance with two decimal places
        System.out.printf("Distance in miles: %.2f\n", miles);
    }
}
