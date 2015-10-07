////////////////////////////////////////////////////
//Madison Licht
//10/5/15
//CSE2
//HW 06
//CheckDigit
//
//This code will prompt the user for an ISBN number and then check to ensure that it is valid using mulitplicaiton & mods.

//   first compile the program
//      javac CheckDigit.java
//   run the program
//      java CheckDigit//

import java.util.Scanner;
//   define a class
public class CheckDigit{
    
//   add main method
  public static void main(String[] args) {
//declare the scanner
     Scanner myScanner = new Scanner( System.in );

//input the ISBN number
int digitOne = 0;
int digitTwo = 0;
int digitThree = 0;
int digitFour = 0;
int digitFive = 0;
int digitSix = 0;
int digitSeven = 0;
int digitEight = 0;
int digitNine = 0;
int digitTen = 0;

int i = 1;
while(i<11){
    if (i==1){
        System.out.print("Enter the First digit: ");
        digitOne = myScanner.nextInt();
        i++;
    }
    if (i==2){
        System.out.print("Enter the Second digit: ");
        digitTwo = myScanner.nextInt();
        i++;
    }
    if (i==3){
        System.out.print("Enter the Third digit: ");
        digitThree = myScanner.nextInt();
        i++;
    }
    if (i==4){
        System.out.print("Enter the Fourth digit: ");
        digitFour = myScanner.nextInt();
        i++;
    }
    if (i==5){
        System.out.print("Enter the Fifth digit: ");
        digitFive = myScanner.nextInt();
        i++;
    }
    if (i==6){
        System.out.print("Enter the Sixth digit: ");
        digitSix = myScanner.nextInt();
        i++;
    }
    if (i==7){
        System.out.print("Enter the Seventh digit: ");
        digitSeven = myScanner.nextInt();
        i++;
    }
    if (i==8){
        System.out.print("Enter the Eighth digit: ");
        digitEight = myScanner.nextInt();
        i++;
    }
    if (i==9){
        System.out.print("Enter the Ninth digit: ");
        digitNine = myScanner.nextInt();
        i++;
    }
    if (i==10){
        System.out.print("Enter the Tenth digit: ");
        digitTen = myScanner.nextInt();
        i++;
    }
}
    
//check to see if this is a valid ISBN number
//multiply each number by decreasing numbers 1-10
int checkDigitOne = digitOne*10;
int checkDigitTwo = digitTwo*9;
int checkDigitThree = digitThree*8;
int checkDigitFour = digitFour*7;
int checkDigitFive = digitFive*6;
int checkDigitSix = digitSix*5;
int checkDigitSeven = digitSeven*4;
int checkDigitEight = digitEight*3;
int checkDigitNine = digitNine*2;
//add these numbers together
int checkAddition = checkDigitOne+checkDigitTwo+checkDigitThree+checkDigitFour+checkDigitFive+checkDigitSix+checkDigitSeven+checkDigitEight+checkDigitNine;
//divide by 11, if remainder = check digit it is valid
int checkDivision = checkAddition%11;


//if statement to test if % is = to last digit and isbn is valid
if (checkDivision==digitTen){
    System.out.println("This is a valid ISBN.");
}
if (checkDivision!=digitTen){
    System.out.println("This is NOT a valid ISBN. Check digit should be "+checkDivision);
}


}
}