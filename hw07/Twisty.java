////////////////////////////////////////////////////
//Madison Licht
//10/9/15
//CSE2
//HW 07
//Twisty
//
//   first compile the program
//      javac Twisty.java
//   run the program
//      java Twisty//


import java.util.Scanner;
//   define a class
public class Twisty {

    //   add main method
    public static void main(String[] args) {
        //declare the scanner
        Scanner myScanner = new Scanner(System.in);

        //an integer to store the user input for length and width
        int length = 0;
        int width = 0;
        //a switch to decide if you want to ask again
        boolean acceptable = false;
        //loop until you get acceptable input
        System.out.print("Input your desired length: ");
        while (!acceptable) {
            //check if the input is a double.
            if (myScanner.hasNextInt()) {
                //if so, store it.
                length = myScanner.nextInt();
                System.out.println();
                acceptable = true;
            }
            else {
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("ERROR: need an integer");
                System.out.print("Input your desired length: ");
                length = myScanner.nextInt();
                System.out.println();
            }
        }
        acceptable = false;
        System.out.print("Input your desired width: ");
        while (!acceptable) {
            //check if the input is a double.
            if (myScanner.hasNextInt()) {
                //if so, store it.
                width = myScanner.nextInt();
                System.out.println();
                acceptable = true;
            }
            else {
                //if not, trash it.  This does not assign the output of 
                //next() to anything. The output is just discarded.
                System.out.println("ERROR: need an integer");
                System.out.print("Input your desired width: ");
                width = myScanner.nextInt();
                System.out.println();
            }
            if (width > length){
                System.out.println("ERROR: width cannot be greater than length.");
                System.out.print("Input your desired width: ");
                width = myScanner.nextInt();
                System.out.println();
            }
        }
        //create the double helix
        int i = 0;
        int j = 0;
        for (i = 0; i < width; i++) {
            for (j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print("#");
                } 
                else if (i == (length - j)) {
                    System.out.print("/");
                }
                else if (j == (width - i)){
                    System.out.print("#");
                }
                else if (j == (width - i)){
                    System.out.print("\\");
                }
                else {
                    System.out.print(" ");
                }
            }
        }


    }
}