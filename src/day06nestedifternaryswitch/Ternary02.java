package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    /*First Question
    Type java code by using ternary.
    Write a program to print absolute value of an integer entered by user.
     */

    /*
    Type java code by using using ternary.
    Take values of length and width of a rectangle from user and check if it is square or not.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = scan.nextInt();

        int result = a<0 ? -1*a : a;
        System.out.println(result);


        //Second Question
        System.out.println("enter the length and width of the rectangle");
        double length =scan.nextInt();
        double width = scan.nextInt();

        String result2 = length == width ? "it is square" : "rectangle";
        System.out.println(result2);


    }
}
