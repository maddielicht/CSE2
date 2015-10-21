////////////////////////////////////////////////////
//Madison Licht
//10/19/15
//CSE2
//HW 08
//String Analysis
//
//   first compile the program
//      javac String Analysis.java
//   run the program
//      java StringAnalysis//

import java.util.Scanner;
//   define a class
public class StringAnalysis {
    //   add main method
    public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            



        }
        //method to input the string
    public static boolean checkInput(String dataInput, Scanner input) {
            boolean acceptable = false;
            System.out.print("Enter a string: ");
            while (!acceptable) {
                if (input.hasNext()) {
                    dataInput = input.next();
                    acceptable = true;
                }
                else {
                    System.out.println("ERROR: need an string");
                    System.out.print("Enter a string: ");
                    dataInput = input.next();
                }
            }
            return acceptable;
        }
        //method to check the amount of characters
    public static boolean checkInput(String dataInput, int charAmt, Scanner input) {
        boolean acceptable = false;
        System.out.print("Enter a string: ");
        while (!acceptable) {
            if (input.hasNext()) {
                dataInput = input.next();
                acceptable = true;
            }
            else {
                System.out.println("ERROR: need an string");
                System.out.print("Enter a string: ");
                dataInput = input.next();
            }
        }
        System.out.print("Enter an int: ");
        charAmt = input.nextInt();
        boolean okay = false;
        while (!okay) {
            char c = dataInput.charAt(charAmt);
            if (Character.isDigit(c)) {
                okay = false;
            }
            else if (Character.isLetter(c)) {
                okay = true;
            }
            return okay;
        }
    }
}