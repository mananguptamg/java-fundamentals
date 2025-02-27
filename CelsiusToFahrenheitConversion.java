// Importing the Scanner class to take user input
import java.util.Scanner;

class CelsiusToFahrenheitConversion {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declaring variables to store temperatures in Celsius and Fahrenheit
        double celsiusTemperature;
        double fahrenheitTemperature;

        // Prompting the user to enter the temperature in Celsius
        System.out.println("Enter temperature in Celsius:");
        celsiusTemperature = sc.nextDouble(); // Reading temperature input from user
        
        // Converting Celsius to Fahrenheit using the formula: (C × 9/5) + 32
        fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        
        // Displaying the converted temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit is: " + fahrenheitTemperature);
    }
}
