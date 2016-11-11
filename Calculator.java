//packages imported 
import java.util.Scanner;

//main file
class Calculator {

 //main class
 public static void main(String[] args) {
   
  //enables user input
  Scanner input = new Scanner(System.in);
  
  //getting user input 
  System.out.println("Input the first number:");
  double a = input.nextDouble();
  System.out.println("Input the second number:");
  double b = input.nextDouble();
  System.out.println();
  System.out.println();
  
  //printing addition
  System.out.println("Adding");
  print(add(a, b));
  System.out.println();
  
  //printing subtraction
  System.out.println("Subtracting");
  print(subtract(a, b));
  System.out.println();
  
  //printing multiplication
  System.out.println("Multiplying");
  print(multiply(a, b));
  System.out.println();
  
  //printing division
  System.out.println("Dividing");
  print(divide(a, b));
  System.out.println();
 }//end main method
 
 //method to print the number
 public static void print(double a){
  System.out.println("The result is: " + a);
 }//end print
 
 //method to add numbers
 public static double add(double a, double b){
  return (a+b);
 }//end add
 
 //method to subtract numbers
 public static double subtract(double a, double b){
  return (a-b);
 }//end add
 
 //method to multiply numbers
 public static double multiply(double a, double b){
  return (a*b);
 }//end add
 
 //method to divide numbers
 public static double divide(double a, double b){
  return (a/b);
 }//end add
 
}//end Calculator