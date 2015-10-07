////////////////////////////////////////////////////
//Madison Licht
//10/5/15
//CSE2
//HW 06
//BarGraph
//
//This code will prompt users for thier expenses for the week and then create a bar graph of the data. Then calculate 
//expenditure for 4 years.

//   first compile the program
//      javac BarGraph.java
//   run the program
//      java BarGraph//


import java.util.Scanner;
//   define a class
public class BarGraph{
    
//   add main method
  public static void main(String[] args) {
//declare the scanner
     Scanner myScanner = new Scanner( System.in );

//enter the expense for each day of the week
int days = 1;
double monExpenses = 0;
double tuesExpenses = 0;
double wedExpenses = 0;
double thuExpenses = 0;
double friExpenses = 0;
double satExpenses = 0;
double sunExpenses = 0;
while (days < 8){
    if (days==1){
     System.out.print("Enter the Monday expenses: ");
     monExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==2){
     System.out.print("Enter the Tuesday expenses: ");
     tuesExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==3){
     System.out.print("Enter the Wednesday expenses: ");
     wedExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==4){
     System.out.print("Enter the Thursday expenses: ");
     thuExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==5){
     System.out.print("Enter the Friday expenses: ");
     friExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==6){
     System.out.print("Enter the Saturday expenses: ");
     satExpenses = myScanner.nextDouble();
     days++;
    }
    if (days==7){
     System.out.print("Enter the Sunday expenses: ");
     sunExpenses = myScanner.nextDouble();
     days++;
    }
    
    do{
        if(!myScanner.hasNextDouble()){
            String wrong = myScanner.next();
            System.out.print("Sorry, you did not enter an integer. Try again: ");
        }
    } while(!myScanner.hasNextDouble());
    
    if (days < 0){
        System.out.print("Please only enter positive numbers. Try again: ");
    }
}

//round the numbers up by .5
double nMonday = monExpenses+0.50;
double nTuesday = tuesExpenses+0.50;
double nWednesday = wedExpenses+0.50;
double nThursday = thuExpenses+0.50;
double nFriday = friExpenses+0.50;
double nSaturday = satExpenses+0.50;
double nSunday = sunExpenses+0.50;

//make the values into stars and create the bar graph
String Mon="";
for(int g=0; g<(int)(nMonday); g++){
Mon=Mon.concat("*");
}
System.out.println("Mon:"+Mon);

String Tue="";
for(int g=0; g<(int)(nTuesday); g++){
Tue=Tue.concat("*");
}
System.out.println("Tue:"+Tue);

String Wed="";
for(int g=0; g<(int)(nWednesday); g++){
Wed=Wed.concat("*");
}
System.out.println("Wed:"+Wed);

String Thu="";
for(int g=0; g<(int)(nThursday); g++){
Thu=Thu.concat("*");
}
System.out.println("Thu:"+Thu);

String Fri="";
for(int g=0; g<(int)(nFriday); g++){
Fri=Fri.concat("*");
}
System.out.println("Fri:"+Fri);

String Sat="";
for(int g=0; g<(int)(nSaturday); g++){
Sat=Sat.concat("*");
}
System.out.println("Sat:"+Sat);

String Sun="";
for(int g=0; g<(int)(nSunday); g++){
Sun=Sun.concat("*");
}
System.out.println("Sun:"+Sun);

//calculate daily average expenses and estimated expenditure
double avgExpense=(monExpenses+tuesExpenses+wedExpenses+thuExpenses+friExpenses+satExpenses+sunExpenses)/7;
System.out.printf("Your average daily expenses are: $%4.2f\n",avgExpense);

double sum =0;
for (sum = 0; sum < 53; sum++){
    int year = (int)(Math.random()*(41)) - 20;
    double percent = (double) year/100.0;
    double randomWeeklyExpense = avgExpense * (1+percent);
    sum = sum + randomWeeklyExpense;
} 
System.out.printf("Estimated expenditure for 4 years: $%4.2f\n", sum);


}
}