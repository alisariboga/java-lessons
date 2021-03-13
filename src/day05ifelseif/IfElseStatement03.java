package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {
        /*
        ask user to enter ant name of the days, then get second, fourth,
        and sixth letters if the day name and print them on the console, in the same line.
        For example; if the user enters "Monday" output will be "ody"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the same of a day");
        String dayName = scan.next();

        if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday") || dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday")) {

            System.out.println("" + dayName.charAt(1) + dayName.charAt(3) + dayName.charAt(5));
        }else{
            System.out.println("Enter a valid day name");
        }

    }
}
