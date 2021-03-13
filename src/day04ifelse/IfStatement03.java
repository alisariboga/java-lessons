package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
         /*
     Type java code by using if statement
     When you enter the name of the day a week,
     output will be "Weekday" or "Weekend day" according to the name of the day
     Get the name of the name from user
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Emter the name of a day ");
        String dayName = scan.next().toUpperCase();

        //to compare Strings DO NOT use "=="sign. We use it for primitives
        //Use equals()
        if (dayName.equals("Monday")) {
            System.out.println();

        }
    }
}
