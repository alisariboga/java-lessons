package day18lists;

import java.util.Arrays;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //Working with lists is easier than working with arrays
        //Because of this sometimes we want to convert arrays to lists

        Integer arr[] = {3,5,7,1,5};
        //We can use asList() from Arrays class
        List<Integer> list1 =  Arrays.asList(arr);
        System.out.println(list1);

        //User some list methods:
        list1.set(1, 10);
        System.out.println(list1);
        System.out.println(list1.subList(2,4));//[7,1]

        //list1.remove(0)
        System.out.println(list1);
    }
}
