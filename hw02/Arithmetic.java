////////////////////////////////////////////////////
//Madison Licht
//Hw 02
//Walmart Shopping Trip Java Program
//
//   first compile the program
//      javac Arithmetic.java
//   run the program
//      java Arithmetic//

//   define a class
public class Arithmetic{
    
//   add main method
  public static void main(String[] args) {
      
//   Number of pairs of socks
int nSocks=3;
//   Cost per pair of socks
//   (‘$’ is part of the variable name)
double sockCost$=2.58;

//   Number of drinking glasses
int nGlasses=6;
//   Cost per glass
double glassCost$=2.29;

//   Number of boxes of envelopes
int nEnvelopes=1;
//   cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;

double myTotalSocks=((double)nSocks*((double)sockCost$));
double myTotalGlasses=((double)nGlasses*((double)glassCost$));
double myTotalEnvelopes=((double)nEnvelopes*((double)envelopeCost$));
double myTotalOverall=myTotalSocks+myTotalGlasses+myTotalEnvelopes;

//total prices including tax
//add in calculation for (total*tax)+total
double myTotalSocksTax=((double)taxPercent*myTotalSocks)+myTotalSocks;
double myTotalGlassesTax=((double)taxPercent*myTotalGlasses)+myTotalGlasses;
double myTotalEnvelopesTax=((double)taxPercent*myTotalEnvelopes)+myTotalEnvelopes;
//    print and calculate the amount of socks, glasses, envelopes, total, and amount of tax on each
System.out.println("The total price of socks is $" +(((double)nSocks*((double)sockCost$))));
System.out.println("The total tax on socks is $" +myTotalSocksTax);
System.out.println("The total price of glasses is $" +(((double)nGlasses*((double)glassCost$))));
System.out.println("The total tax on glasses is $" +myTotalGlassesTax);
System.out.println("The total price of envelopes is $" +(((double)nEnvelopes*((double)envelopeCost$))));
System.out.println("The total tax on envelopes is $" +myTotalEnvelopesTax);
System.out.println("The overall total is $" +(myTotalSocks+myTotalGlasses+myTotalEnvelopes));
System.out.println("The taxed total is $" +(myTotalSocksTax+myTotalGlassesTax+myTotalEnvelopesTax));



  }
}