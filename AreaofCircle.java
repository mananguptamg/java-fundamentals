import java.util.Scanner;

class AreaofCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double radius;
		double areaofCircle;
		
		System.out.println("Enter the radius of circle");
		radius = sc.nextDouble();

		areaofCircle = 22/7 * radius * radius;
		System.out.print("Area of circle with radius " +radius+ " is " +areaofCircle);
	}
}
