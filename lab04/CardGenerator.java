////////////////////////////////////////////////////
//Madison Licht
//9/4/15
//CSE2
//Lab 04
//Card Generator
//
//   first compile the program
//      javac CardGenerator.java
//   run the program
//      java CardGenerator//

//   define a class
public class CardGenerator{
    
//   add main method
  public static void main(String[] args) {

// generate random number 1 to 52
int cardIdentity = (int)(Math.random()*52)+1;
String cardSuitName="";
//if statement to determine card suit
if (cardIdentity>=1 && cardIdentity<=13)
cardSuitName="Diamonds";
  else if (cardIdentity>=14 && cardIdentity<=26)
  cardSuitName="Clubs";
    else if (cardIdentity>=27 && cardIdentity<=39)
    cardSuitName= "Hearts";
      else if (cardIdentity>=40 && cardIdentity<=52)
      cardSuitName="Spades";
// use a switch statement to assign the card identity
switch (cardIdentity%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName);
    break;



}
  }
}