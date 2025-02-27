// Importing the Scanner class to take user input
import java.util.Scanner;

class AreaofCircle {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declaring variables for radius and area of the circle
        double radius;
        double areaofCircle;
        
        // Prompting the user to enter the radius of the circle
        System.out.println("Enter the radius of the circle:");
        radius = sc.nextDouble(); // Reading radius input from user

        // Calculating the area of the circle using the formula: π * r^2
        areaofCircle = Math.PI * radius * radius; 
        
        // Displaying the calculated area
        System.out.println("Area of the circle with radius " + radius + " is " + areaofCircle);
    }
}
