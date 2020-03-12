/*The program provides a menu with 5 options of conversion operations
        (eg. meters to feet, CAD to USD, Celsius to Fahrenheit, ...).
        Based on the user selection, the program should proceed
        with proper instructions, input and output operations.

        Written By MOHAMMAD EL KASWANI
 */

import java.util.*;
public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("Please choose one of the options");
        System.out.println("(1) feets to meters");
        System.out.println("(2) CAD to USD");
        System.out.println("(3) Calculate the Area");
        System.out.println("(4) Calculate the Age");
        System.out.println("(5) Calculate the BMI ");
        
        choice =sc.nextInt();
        
        if(choice == 1){
            double feet;
            double meters;

            System.out.println("\n Type the height in feets");
            feet = sc.nextDouble();
            meters =  0.3048 * feet;
            System.out.println("\nYour height in meters is " + meters +"meters");

        } else if (choice == 2){
            double amountCAD;
            double amountUSD;
            final double FACTOR = 0.75;

            System.out.println("\n Type the amount of CAD");
            amountCAD = sc.nextDouble();
            amountUSD = amountCAD * FACTOR;
            System.out.println("\n" + amountCAD + " CAD if equivalent to "
                    + amountUSD + "USD");

        } else if (choice == 3){
            double triangle;
            double length;
            double width;

            System.out.println("\nType how much the length");
            length = sc.nextDouble();
            System.out.println("\nType how much the Width");
            width = sc.nextDouble();
            final double area = (length * width);
            System.out.println("\nThe Area of triangle is " + area);

        } else if (choice == 4){
            int yearOfBirth;
            int currentYear;
            int year;

            System.out.println("\nType your Year of birth");
            yearOfBirth = sc.nextInt();
            currentYear = 2020;
            year = (currentYear - yearOfBirth);
            System.out.println("\nMy Age Is " + year);

        } else if (choice == 5) {
            double feet;
            double pound;
            double meters;
            double kiloGrams;
            double BMI;


            System.out.println("\nType your weight in pound");
            pound = sc.nextDouble();
            kiloGrams = 2.20462 * pound;
            System.out.println("\nYour weight in kiloGrams is " + kiloGrams);

            System.out.println("\nType your height in feet");
            feet = sc.nextDouble();
            meters = 0.3048 * feet;
            System.out.println("\nYour height in meters is " + meters);

            BMI = (kiloGrams / (meters * meters));
            System.out.println("\nyour Body Mass Index (BMI) in kilograms and feet is "
                    + BMI);
        }

    }

}
    

