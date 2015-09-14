////////////////////////////////////////////////////
//Madison Licht
//Hw 02
//Timer Java Program
//
//   first compile the program
//      javac Timer.java
//   run the program
//      java Timer//
import java.util.Scanner;
//   define a class
public class Timer{
      //add main method
  public static void main(String[] args) {
      //declare the scanner
     Scanner myScanner = new Scanner( System.in );
        //enter current time
        System.out.print("Enter the current time in the form of HHMM : ");
        int current_time = myScanner.nextInt();
        //enter dinner time
        System.out.print("Enter the time you will be eating dinner in the form of HHMM: ");
        int dinner_time = myScanner.nextInt();
        //find difference in dinner and current time
        int wait_time;
        int hours;
        int minutes;
        wait_time = dinner_time - current_time;
        hours = wait_time/100;
        minutes = (wait_time%100); //the % (mod) operator returns the remainder
        System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner");
        
    
  }
}