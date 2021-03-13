package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
    public static void main(String[] args) {
        /*
        Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D     2. 50 to 59 - C       3. 60 to 80 - B.     4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please your mark");
        int a = scan.nextInt();

        if (a < 0) {
            System.out.println("Enter a valid mark");
        } else if (a < 50) {
            System.out.println("D");
        } else if (a >= 50 && a <= 59) {
            System.out.println("C");
        } else if (a >= 60 && a <= 80) {
            System.out.println("B");
        } else if (a >= 81 && a <= 100) {
            System.out.println("A");
        }


    }
}
