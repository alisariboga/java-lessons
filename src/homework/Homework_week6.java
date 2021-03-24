package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_week6 {
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5};
//        int[] newArr = new int[5];
//        int[] newArr2 = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i] + 1;
//        }
//        System.out.println(Arrays.toString(newArr));
//
//
//        int j = 0;
//        for (int i : arr) {
//            newArr2[j] = newArr[j] + 1;
//            j++;
//
//        }
//        System.out.println(Arrays.toString(newArr2));


        /* Create a class : RandomNameGenerator
         * Step1: Ask user to enter his/her name //john walker
         * Step2: Delete the spaces in the username//johnwalker
         * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
         * Step4: If there the username is not taken, then print: This username is available
         * Step5: If the username is already taken, then print This username is already taken
         * Step6: Then generate a random number, add to the name, and Print the new username
         */

        //step 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese enter the username");
        String name = scan.nextLine();

        //step 2
        System.out.println(name.replace(" ", ""));

        //step 3
        for ()

    }
}
