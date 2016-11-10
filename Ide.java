import java.util.Scanner;

class CodeChef {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the first number:");
		double a = input.nextDouble();
		System.out.println("Input the second number:");
		double b = input.nextDouble();
		System.out.println();
		System.out.println();
		
		System.out.println("Adding");
		print(add(a, b));
		System.out.println();
		
		System.out.println("Subtracting");
		print(subtract(a, b));
		System.out.println();
		
		System.out.println("Multiplying");
		print(multiply(a, b));
		System.out.println();
		
		System.out.println("Dividing");
		print(divide(a, b));
		System.out.println();
	}//end main method
	
	public static void print(double a){
		System.out.println("The result is: " + a);
	}//end print
	
	public static double add(double a, double b){
		return (a+b);
	}//end add
	
	public static double subtract(double a, double b){
		return (a-b);
	}//end add
	
	public static double multiply(double a, double b){
		return (a*b);
	}//end add
	
	public static double divide(double a, double b){
		return (a/b);
	}//end add
	
	
	
}//end Calculator