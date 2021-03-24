package day18lists;

import java.util.*;

public class Lists03 {
    public static void main(String[] args) {
        /*
        From an integer list find the closest two elements(take List elements from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want how many number");
        int listNum = scan.nextInt();
        List<Integer> list = new ArrayList<>(listNum);
        for (int i = 0; i < listNum; i++) {
            System.out.println("Enter the number please");
            int takeNum = scan.nextInt();
            list.add(takeNum);

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        int min = Integer.MAX_VALUE;
        int difference = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            difference = list.get(i + 1) - list.get(i);
            if (min > difference) {
                min = difference;
                num1 = list.get(i);
                num2 = list.get(i + 1);
            }
        }
        System.out.println("The difference is : " + min + " num1 is: " + num1 + " num2 is: " + num2);
    }
}
