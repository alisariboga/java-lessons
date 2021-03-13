package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        checkInitial();


        /*
        Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
         */
    }
        public static void checkInitial() {
            Scanner scan = new Scanner(System.in);
            String firstName = "";
            do {
                System.out.println("Enter the your firstname");
                firstName = scan.nextLine();
                if (firstName.charAt(0) >='A' && firstName.charAt(0)<='Z') {
                    System.out.println("You did it right");
                }else{
                    System.out.println("Make the initial upper case");
                }

            }while(!(firstName.charAt(0) >='A' && firstName.charAt(0)<='Z'));
        }
    }

