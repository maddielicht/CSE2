////////////////////////////////////////////////////
//Madison Licht
//Lab 03
//Check Java Program
//
//   first compile the program
//      javac Timer.java
//   run the program
//      java Timer//
//import the scanner
import java.util.Scanner;
//   define a class
public class Check{
      //add main method
  public static void main(String[] args) {
      //declare the scanner
     Scanner myScanner = new Scanner( System.in );
// prompt the user for the original cost of the check
System.out.print("Enter the original cost of the check in the form xx.xx: ");
//accept user data
double checkCost = myScanner.nextDouble();
//prompt the user for the tip percentage
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );
double tipPercent = myScanner.nextDouble();
tipPercent /= 100; //We want to convert the percentage into a decimal value
//prompt the user for the amount of people who went out to dinner
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople = myScanner.nextInt();
double totalCost;
double costPerPerson;
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

  }
}