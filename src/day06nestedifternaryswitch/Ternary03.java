package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    /*
    Ask user to enter an integer. If the number has 3 digits, output will be
    “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
    How can you decide the number of digits of an integer?
     */

    /*
    Ask user to enter a String. If the String has 2 characters, output will be
    “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");
        int num1 = scan.nextInt();

        String result = (num1>=100 && num1<=999) || (num1<=-100 && num1>=-999) ? "This number has 3 digit " : "This number has not 3 digit";
        System.out.println(result);

        //second question
        System.out.println("enter a abbreviation of a state");
        String abbreviation = scan.next();

        String result2 = abbreviation.length()==2 ? "It is valid for state abbreviation" : "It is not valid for state abbreviation";
        System.out.println(result2);

    }
}
