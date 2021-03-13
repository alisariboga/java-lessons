package day10forloops;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {
        printFactorialResult();

    }
    /*
    Get an integer from user and calculate the factorial
    For example; user --> 5 ==> 5!=120
     */

    public static void printFactorialResult() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int d = scan.nextInt();

        int i = 1;
        int result = 1;

        while (i <= d) {
            result = result * i;

            i++;
        }
        System.out.println(result);
        scan.close();

    }
}

