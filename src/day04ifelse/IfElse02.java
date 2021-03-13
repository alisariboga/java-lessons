package day04ifelse;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        /*
        Ask user to enter a character then check whether the character is alphabet or not
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toUpperCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is from alphabet");
        }else{
            System.out.println("It is nit from alphabet");
        }
    }
}
