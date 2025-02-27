import java.util.Scanner;

class VolumeofCylinder{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		double radius;
		double height;
		double volumeofCylinder;

		System.out.println("Enter radius of cylinder");
		radius = sc.nextDouble();
		System.out.println("Enter height of cylinder");
		height = sc.nextDouble();
		volumeofCylinder = Math.PI * radius * radius * height;
		
		System.out.println("Volume of Cylinder with radius " +radius+ " and height " +height+ "is " +volumeofCylinder);
	}
} 
