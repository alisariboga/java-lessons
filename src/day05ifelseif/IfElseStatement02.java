package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {
    public static void main(String[] args) {
        /*
        Ask user to enter a character, then check whether the character is alphabet or not
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character to check if it is in alphabet or not");
        char ch = scan.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is alphabet");
        }else{
            System.out.println(ch + " is not alphabet ");
        }
    }
}
