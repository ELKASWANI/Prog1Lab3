/*program that calculates the Body Mass Index (BMI) of a person.
The user should input the weight in pounds and height in feet,
and the program should output the weight converted to kilograms,
height converted to meters, the calculated BMI (BMI = Kg/(m2)),
and its classification as underweight, normal, overweight or obese.

Written By MOHAMMAD EL KASWANI
 */
import java.util.*;
public class Question2 {

    public static void main(String[] args) {

        //declaring variables
        double feet;
        double pound;
        double meters;
        double kiloGrams;
        double BMI;

        //getting user input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nType your weight in pound");
        pound = sc.nextDouble();
        kiloGrams = pound / 2.20462;
        System.out.println("\nYour weight in kiloGrams is " + kiloGrams);

        //getting user input
        Scanner s = new Scanner(System.in);
        System.out.println("\nType your height in feets");
        feet = s.nextDouble();
        meters = 0.3048 * feet;
        System.out.println("\nYour height in meters is " + meters);

        // Calculate
        BMI = (kiloGrams / (meters * meters));
        System.out.println("\nyour Body Mass Index (BMI) in kilograms and feet is "
                + BMI);

        // printing
        if (BMI <= 18.5) {
            System.out.println("\nUNDERWEIGHT");
        }else if(BMI >=18.5 && BMI<=25){
            System.out.println("\nNORMAL WEIGHT");
        }else if(BMI >25.0 && BMI<=30){
            System.out.println("\nOVERWEIGHT");
        }else if(BMI >30.0 && BMI<=35){
            System.out.println("\nCLASS | OBESITY");
        }else if(BMI >35.0 && BMI<=40){
            System.out.println("\nCLASS || OBESITY");
        }else if(BMI > 40.0){
            System.out.println("\nCLASS ||| OBESITY");
        }

    }
}
