package day18lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists02 {
    /*
    Create a method to delete odd elements and increase the even elements by multiplying
     */
    public static void main(String[] args) {
        //This is my solution
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want how many number");
        int listNum = scan.nextInt();
        List<Integer> list1 = new ArrayList<>(listNum);
        for (int i = 0; i < listNum; i++) {
            System.out.println("Enter the number please");
            int takeNum = scan.nextInt();
            list1.add(takeNum);
        }
        //It's tutors solution
//        list1.add(8);
//        list1.add(5);
//        list1.add(9);
//        list1.add(6);
//        list1.add(4);
        updateList(list1);

    }

    public static void updateList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
                i--;

            } else {
                list.set(i, list.get(i) * 5);
            }
        }
        System.out.println("Your list is  : " + list);
    }
}
