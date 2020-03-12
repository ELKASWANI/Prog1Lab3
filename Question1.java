/*This program calculates the area of a circle,
based on a radius given by the user. If the input is negative,
or zero, the program should not calculate the area, but warn the
user of the mistake.

Written By MOHAMMAD EL KASWANI
*/
import java.util.*;

public class Question1{

	public static void main (String[] args){
		System.out.println("\nCalculates the area of a circle?");

		//declaring variables
		double radius;
		double area;
		Scanner sc = new Scanner(System.in);

		//getting user input
		System.out.println("\nWhat is the radius of the circle");
		radius = sc.nextDouble();
		
		// Calculate
		area = ((radius*radius)*Math.PI);

		// printing
		if(radius >= 0){
			System.out.println("\nThe area of the circle is " + area);
		}else if(radius <= 0){
			System.out.println("\nThe program can't calculate the area beacause there is a mistake");
		}
	}
}