/*
Write a program that prompts the user for his/her date of birth
 in the format YYYY-MM-DD and outputs the user age, plus a message in the lines:
“Your birthday is in XX days”, or “Your birthday was XX days ago”
(substitute XX by the calculated amount of days), depending if
the date in the current year has passed or not.

Written By MOHAMMAD EL KASWANI

 */
import java.util.*;

public class Question5{
    public static void main(string[] args){
        System.out.println("");

        int DateOfBirth;

        Scanner sc = new Scanner(System.in);
        System.out.println("Type Your date of birth by YYYY-MM-DD");
        DateOfBirth = sc.nextInt();

        int year, month, day = map(int, userInput.split('-'));
        today = date.today();
        date1 = date(today.year, month, day);

        DaysRemain = (date1 -today).days;

        if (DaysRemain > 0) {
            System.out.println("It's " + str(DaysRemain) + " days until your birthday");
        }else if( DaysRemain < 0) {
            System.out.println("It's been " + str(DaysRemain) + " days since your birthday");
        }else if (DaysRemain == 0) {
            System.out.println("Happy Birthday!");
        }
    }
}