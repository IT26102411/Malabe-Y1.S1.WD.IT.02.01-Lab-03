import java.util.Scanner;
public class IT26102411Lab3Q1A{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter the price of 1Kg of rice:"); 
  double price = input.nextDouble();

  System.out.println("Enter the number if kilograms you want to buy:");
  int kilograms = input. nextInt();

  double total = price*kilograms; 
  
  System.out.println("The total amount is:"+total);





   }
}