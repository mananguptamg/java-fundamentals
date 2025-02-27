// Importing the Scanner class to take user input
import java.util.Scanner;

class VolumeofCylinder {
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring variables for radius, height, and volume of the cylinder
        double radius;
        double height;
        double volumeofCylinder;

        // Prompting the user to enter the radius of the cylinder
        System.out.println("Enter the radius of the cylinder:");
        radius = sc.nextDouble(); // Reading radius input from user

        // Prompting the user to enter the height of the cylinder
        System.out.println("Enter the height of the cylinder:");
        height = sc.nextDouble(); // Reading height input from user

        // Calculating the volume of the cylinder using the formula: π * r^2 * h
        volumeofCylinder = Math.PI * radius * radius * height;
        
        // Displaying the calculated volume with proper spacing
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + " is " + volumeofCylinder);
    }
}
