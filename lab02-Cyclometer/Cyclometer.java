////////////////////////////////////////////////////
//Madison Licht
//9/4/15
//CSE2
//Lab 02
//Bicycle Cyclometer
//
//   first compile the program
//      javac Cyclometer.java
//   run the program
//      java Cyclometer//

//   define a class
public class Cyclometer{
    
//   add main method
  public static void main(String[] args) {
      
//   
// our input data. Document your variables by placing your
		// comments after the “//”. State the purpose of each variable.

	   	int secsTrip1=480;  //number of seconds in trip 1
       	int secsTrip2=3220;  //number of seconds in trip 2
		int countsTrip1=1561;  //number of rotations for trip 1
		int countsTrip2=9037; //number of rotations in trip 2
    
    double wheelDiameter=27.0,  //diameter of the wheel in inches
  	PI=3.14159, //
  	feetPerMile=5280,  //
  	inchesPerFoot=12,   //
  	secondsPerMinute=60;  //
	double distanceTrip1, distanceTrip2,totalDistance;  //
System.out.println("Trip 1 took"+(secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip1+"counts.");
System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinute)+"minutes and had "+countsTrip2+"counts.");
//run the calculations; store the values. Document your
		//calculation here. What are you calculating?
		//we are calculating the total distance of the trip by multiplying the rotations of the wheel by the diameter by pi
		//
distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");


  }
}