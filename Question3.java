/*
program that prompts the user for the current temperature in Celsius
and outputs different messages if it is above or below zero.

Written By MOHAMMAD EL KASWANI
*/
import java.util.*;

public class Question3{

    public static void main (String[] args){

        //declaring variables
        double temperature;
        Scanner sc = new Scanner(System.in);

        //getting user input
        System.out.println("\nWhat is the current temperature?");
        temperature = sc.nextDouble();

        //Printing
        if(temperature <= 0){
            System.out.println("\nThe temperature is below zero");
        }else if(temperature >= 0){
            System.out.println("\nThe temperatureis above the zero");
        }
    }

}
