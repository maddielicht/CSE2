////////////////////////////////////////////////////
//Madison Licht
//Hw 02
//Block Java Program
//
//   first compile the program
//      javac Block.java
//   run the program
//      java Block//
import java.util.Scanner;
//   define a class
public class Block{
      //add main method
  public static void main(String[] args) {
      //declare the scanner
     Scanner myScanner = new Scanner( System.in );
     
        //enter the length of the block
        System.out.print("Enter the length of the block in the form of x.x: ");
        double length = myScanner.nextDouble();
        //enter the width of the block
        System.out.print("Enter the width of the block in the form of x.x: ");
        double width = myScanner.nextDouble();
        //enter the height of the block
        System.out.print("Enter the height of the block in the form of x.x: ");
        double height = myScanner.nextDouble();
        
        //calculate volume and surface area
        double volume = length * width * height;
        double surfaceArea = ((2*(length * width)) + (2*(length * height)) + (2*(width * height)));
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is " +volume+". The surface area of the block is "+surfaceArea);
        
     
     
     
  }
}