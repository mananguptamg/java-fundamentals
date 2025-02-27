import java.util.Scanner;

class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		
		System.out.println("Enter first number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number"); 		
		secondNumber = sc.nextInt();
		
		System.out.print("The addition of numbers is " + (firstNumber+secondNumber));
	}
}
