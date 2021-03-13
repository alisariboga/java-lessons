package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement02 {
    /*
    If the user pressed 1, 2, 3 the program will print the number that is pressed;
    otherwise, program will print “Not allowed”.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press the number 1,2 or 3");
        int num1 = scan.nextInt();

        switch (num1) {
            case 1 :
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3 :
                System.out.println("3");
                break;
            default:
                System.out.println("Not allowed");
        }

    }
}
