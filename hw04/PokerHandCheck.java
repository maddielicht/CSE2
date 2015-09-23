////////////////////////////////////////////////////
//Madison Licht
//9/4/15
//CSE2
//Lab 04
//Card Generator
//
//   first compile the program
//      javac PokerHandCheck.java
//   run the program
//      java PokerHandCheck//

//   define a class
public class PokerHandCheck{
    
//   add main method
  public static void main(String[] args) {

// generate 5 random numbers in the interval 1 to 52, subtracting  1 each time as you remove a card
int cardIdentity1 = (int)(Math.random()*52)+1;
int cardIdentity2 = (int)(Math.random()*52)+1;
int cardIdentity3 = (int)(Math.random()*52)+1;
int cardIdentity4 = (int)(Math.random()*52)+1;
int cardIdentity5 = (int)(Math.random()*52)+1;


String cardSuitName1="";
String cardSuitName2="";
String cardSuitName3="";
String cardSuitName4="";
String cardSuitName5="";
//if statement to determine card suit for each of the 5 cards
if (cardIdentity1>=1 && cardIdentity1<=13){
cardSuitName1="Diamonds";}
  else if (cardIdentity1>=14 && cardIdentity1<=26){
  cardSuitName1="Clubs";}
  else if (cardIdentity1>=27 && cardIdentity1<=39){
  cardSuitName1= "Hearts";}
  else if (cardIdentity1>=40 && cardIdentity1<=52){
  cardSuitName1="Spades";}

if (cardIdentity2>=1 && cardIdentity2<=13){
cardSuitName2="Diamonds";}
  else if (cardIdentity2>=14 && cardIdentity2<=26){
  cardSuitName2="Clubs";}
  else if (cardIdentity2>=27 && cardIdentity2<=39){
  cardSuitName2= "Hearts";}
  else if (cardIdentity2>=40 && cardIdentity2<=52){
  cardSuitName2="Spades";}

if (cardIdentity3>=1 && cardIdentity3<=13){
cardSuitName3="Diamonds";}
  else if (cardIdentity3>=14 && cardIdentity3<=26){
  cardSuitName3="Clubs";}
  else if (cardIdentity3>=27 && cardIdentity3<=39){
  cardSuitName3= "Hearts";}
  else if (cardIdentity3>=40 && cardIdentity3<=52){
  cardSuitName3="Spades";}

if (cardIdentity4>=1 && cardIdentity4<=13){
cardSuitName4="Diamonds";}
  else if (cardIdentity4>=14 && cardIdentity4<=26){
  cardSuitName4="Clubs";}
  else if (cardIdentity4>=27 && cardIdentity4<=39){
  cardSuitName4= "Hearts";}
  else if (cardIdentity4>=40 && cardIdentity4<=52){
  cardSuitName4="Spades";}

if (cardIdentity5>=1 && cardIdentity5<=13){
cardSuitName5="Diamonds";}
  else if (cardIdentity5>=14 && cardIdentity5<=26){
  cardSuitName5="Clubs";}
  else if (cardIdentity5>=27 && cardIdentity5<=39){
  cardSuitName5= "Hearts";}
  else if (cardIdentity5>=40 && cardIdentity5<=52){
  cardSuitName5="Spades";}

// use a switch statement to assign the card identities for each card
switch (cardIdentity1%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName1);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName1);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName1);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName1);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName1);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName1);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName1);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName1);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName1);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName1);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName1);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName1);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName1);
    break;
}
switch (cardIdentity2%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName2);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName2);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName2);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName2);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName2);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName2);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName2);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName2);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName2);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName2);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName2);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName2);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName2);
    break;
}
switch (cardIdentity3%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName3);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName3);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName3);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName3);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName3);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName3);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName3);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName3);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName3);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName3);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName3);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName3);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName3);
    break;
}
switch (cardIdentity4%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName4);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName4);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName4);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName4);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName4);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName4);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName4);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName4);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName4);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName4);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName4);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName4);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName4);
    break;
}
    switch (cardIdentity5%13){
    case 1:
    System.out.println("You picked the Ace of "+ cardSuitName5);
    break;
    case 2:
    System.out.println("You picked the 2 of "+ cardSuitName5);
    break;
    case 3:
    System.out.println("You picked the 3 of "+ cardSuitName5);
    break;
    case 4:
    System.out.println("You picked the 4 of "+ cardSuitName5);
    break;
    case 5:
    System.out.println("You picked the 5 of "+ cardSuitName5);
    break;
    case 6:
    System.out.println("You picked the 6 of "+ cardSuitName5);
    break;
    case 7:
    System.out.println("You picked the 7 of "+ cardSuitName5);
    break;
    case 8:
    System.out.println("You picked the 8 of "+ cardSuitName5);
    break;
    case 9:
    System.out.println("You picked the 9 of "+ cardSuitName5);
    break;
    case 10:
    System.out.println("You picked the 10 of "+ cardSuitName5);
    break;
    case 11:
    System.out.println("You picked the Jack of "+ cardSuitName5);
    break;
    case 12:
    System.out.println("You picked the Queen of "+ cardSuitName5);
    break;
    case 13:
    System.out.println("You picked the King of "+ cardSuitName5);
    break;
    }
//print out if there are pairs or if there is a high card hand
int counter = 0;
if (cardIdentity1%13==cardIdentity2%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity1%13==cardIdentity3%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
    }
if (cardIdentity1%13==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
  }
if (cardIdentity1%13==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity2%13==cardIdentity3%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity2%13==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity2%13==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity3%13==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity3%13==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity4%13==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have a pair!");
}
if (cardIdentity1%13==cardIdentity2%13 && cardIdentity1==cardIdentity3%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity1%13==cardIdentity2%13 && cardIdentity1==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity1%13==cardIdentity2%13 && cardIdentity1==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity1%13==cardIdentity3%13 && cardIdentity1==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity1%13==cardIdentity3%13 && cardIdentity1==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity2%13==cardIdentity3%13 && cardIdentity2==cardIdentity4%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity2%13==cardIdentity3%13 && cardIdentity2==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity2%13==cardIdentity4%13 && cardIdentity2==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
if (cardIdentity3%13==cardIdentity4%13 && cardIdentity3==cardIdentity5%13){
  counter = counter + 1;
  System.out.println("You have 3 of a kind!");
}
else if (counter == 0){
  System.out.println("You have a high hand!");
  
}

}
}