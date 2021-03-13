package day21accessmodifiersstringbuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Question 1
		Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops.
		e.g:
		char ch1= 'a' ;
		String name =“John came late"
        => number of a = 2
		*/
//        System.out.println("Please enter the name");
//        String name = scan.next();
//        System.out.println("Please enter the letter");
//        char ch1 = scan.next().charAt(0);
//
//        int counter = 0;
//        for (int i = 0; i < name.length(); i++) {
//            if (ch1 == name.charAt(i)) {
//                counter++;
//            }
//        }
//        System.out.println("The number of " + ch1 + " is " + counter);
//        scan.close();


        /* Question 2
        Print even numbers between 1-20 inclusive.  e.g.2 4 6 .. 20


     Print odd numbers between 1-20 inclusive. e.g 1,3,5,7,...,19  Including comma!


     Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,5

     Find the sum of all even numbers from 1 - 20 inclusive

     Print all numbers from 1-20 except 11 or 15; use break or continue.
*/


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        list.add(18);
//        list.add(19);
//        list.add(20);
//        list.add(21);
//        list.add(22);
//
//        for (int i = 0; i <=list.size(); i++) {
//            if (i % 2 == 0) {
//                System.out.print(i);
//                if (i != list.size()) {
//
//                    System.out.print(", ");
//                }
//
//            }
//        }
//        System.out.println("");
//
//
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i);
//                if (i != 19) {
//
//                    System.out.print(", ");
//                }
//
//            }
//        }
//        System.out.println("");
//
//
        for (int i = 20; i > 0; i--) {
            if (i % 5 == 0) {
                System.out.print(i);
                if (i != 1) {

                    System.out.print(", ");
                }

            }
        }
//        System.out.println("");
//        int sum = 0;
//        for (int i = 20; i > 0; i--) {
//            sum = sum + i;
//
//
//        }
//        System.out.println(sum);
//
//        for (int i = 0; i <= 20; i++) {
//
//            System.out.print(i);
//            if (i != 20) {
//                System.out.print(", ");
//            }
//
//            if (i == 15) {
//                continue;
//
//
//            }
//        }
//        System.out.println("");
        /* Question 3
    Write a code that returns the duplicate chars in a String array e.g.
    String str=“ilovejavatoo”
    Output: o v a
         	*/

//
//        String result = "";
//        String str = "ilovejavatoo";
//        String arr[] = str.split("");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i].equals(arr[j]) && i != j) {
//                    if (result.contains(arr[i])) {
//                        continue;
//                    }
//                    result = result + arr[i] + " ";
//                }
//            }
//        }
//        System.out.println(result);
    /* Question 4
        Get numbers from the user and output that number consecutive fibonacci number sequence
     	e.g : User enters 10
        output : 0 1 1  2  3  5 8 13 21 34
      	*/

//        System.out.println("Please enter the numbers");
//        int number = scan.nextInt();
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 2; i++) {
//            list.add(i);
//        }
//        int counter1 = 0;
//        for (int i = 0; i < list.size(); i++) {
//            list.add(list.get(i) + list.get(i + 1));
//            counter1++;
//            if (counter1 == number - 2) {
//                break;
//            }
//        }
//        System.out.println(list);

         /* Question 5
	        String day= "8MARCH";
	         use charAt method and loop then print all letters on the console
	          */


//        String day = "8MARCH";
//        for (int i = 0; i < day.length(); i++) {
//            System.out.print(day.charAt(i) + " ");
//        }
    }


}


