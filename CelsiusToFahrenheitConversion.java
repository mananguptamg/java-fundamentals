import java.util.Scanner;

class CelsiusToFahrenheitConversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double celsiusTemperature;
		double fahrenheitTemperature;

		System.out.println("Enter temperature in celsius");
		celsiusTemperature = sc.nextDouble();
		fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;
		System.out.println("Temperature in fahrenheit is " + fahrenheitTemperature);
	}
}
