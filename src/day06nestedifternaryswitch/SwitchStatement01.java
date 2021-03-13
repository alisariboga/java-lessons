package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement01 {
    /*

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day");
        int d = scan.nextInt();

        //In switch statement, Long, double, float, boolean cannot be used
        //In switch statement String, char, int, byte, short can be used
        switch (d) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number");
        }
    }
}
