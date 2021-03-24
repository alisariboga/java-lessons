package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkWeek5 {
    public static void main(String[] args) {
        /* Question 1

		Ask User to enter numbers and add and print the numbers he entered then request the new number.
		 If the sum of the numbers entered exceeds 100, Print “You entered …….. numbers.
		  That's enough ! “  and finish the game.
		*/


//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        while (sum <= 100) {
//            System.out.println("please enter number");
//            int getNumber = scanner.nextInt();
//            sum += getNumber;
//            count++;
//        }
//        System.out.println("You entered sum: " + sum + " ." + count + " times,That's enough");

        /* Question 2  
        There is a lonely monkey in the island
     * He needs to eat 4 bananas every day
     * There are just 165 bananas in that island
     * Create following variables and find how many day monkey can survive.
     * Use do while loop, increment and decrement and if statements
        int numbersOfBananas = 165,
        survivalDays = 1;
        boolean monkeyAlive = true;
     */

//        int numbersOfBananas = 165;
//        int survivalDays = 1;
//        boolean monkeyAlive = true;
//
//
//        for (int i = numbersOfBananas; i > 0; i -= 4) {
//
//            numbersOfBananas = i;
//            if (i % 4 != 0) {
//                monkeyAlive = false;
//            }
//            survivalDays++;
//        }
//        System.out.println(numbersOfBananas + " " + "\n" + survivalDays);


        int numbersOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            numbersOfBananas -= 4;
            if (numbersOfBananas >= 4) {
                monkeyAlive = true;
                survivalDays++;
            } else {
                monkeyAlive = false;
            }
        } while (monkeyAlive == true);
        System.out.println(survivalDays + " " + " Muz sayisi: " + numbersOfBananas);
    }


        /* Question 3

    Create a method called numberOfChars and pass 2 parameters;
    1. car
    2. String
	char ch = 'p';
	String str = "population is number of people";
	int count = 0;
    then find how many times the given char is repeated in the String and print it on the console
    *Use for loop, increment and if statements
		*/
//        Scanner scan = new Scanner(System.in);
//        char letter = scan.next().charAt(0);
//        String sentence = "population is number of people";
//        numberOfChars(letter, sentence);


        /* Question 4
          Write the method that will print the reverse of the number you received from the user on the console.

            */

//        System.out.println("How many numbers will you enter");
//        int requestNumbers = scan.nextInt();
//        int arr[] = new int[requestNumbers];
//        for (int i = 0; i < requestNumbers; i++) {
//            System.out.println("Please enter the numbers");
//            int takeNumber = scan.nextInt();
//            arr[i] = takeNumber;
//        }
//        int brr[] = new int[arr.length];
//        Integer counter = arr.length - 1;
//        for (Integer w : arr) {
//            brr[counter] = w;
//            counter--;
//
//
//        }

//        System.out.println(Arrays.toString(brr));
}


//    //Question 3
//    public static void numberOfChars(char ch, String str) {
//
//        int counter = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == (ch)) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//
//
//    }




