package day07stringmanipulations;

import java.util.Scanner;

public class Substring01 {
    public static void main(String[] args) {


    /*
    A part of a String is called substring
    substring() of String class is used for getting a substring from the String
    We used substring() to get a part of a String by using indexes
     */

        String s1 = "Java is Java";
        System.out.println(s1.substring(5));//is Java
        //Index is inclusive
        System.out.println(s1.substring(7));// Java
        System.out.println(s1.substring(0));//Java is Java
        //How can I get the last character?
        System.out.println(s1.substring(s1.length() - 1));//a
        System.out.println(s1.substring(12));//nothing
        //System.out.println(s1.substring(13));// StringIndexOutOfBoundsException

        /*
        We have two type of error messages :
        1) While we type our codes we get "red underline! this is called "Compile Time Error"
        2) While we type our codes we don't get any red underline bt after running our codes we get red messages on the
        console, it is "Run TIme Error
         */

        String s2 = "Java is oop language";
        System.out.println(s2.substring(0, 3));
        //How can I get just i ?
        System.out.println(s2.substring(5, 6));



        /*
        Ask user to enter to a String
        If the first and the last character of the String are same
        print "Wooow!" otherwise, pront "Hmmm!" on the console
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String please");
        String str5 = scan.nextLine();
        String first = str5.substring(0, 1);
        String last = str5.toUpperCase().substring(str5.length() - 1);

        if (first.equals(last)) {
            System.out.println("Woow!");
        } else {
            System.out.println("Hmmm!");
        }


    }
}
