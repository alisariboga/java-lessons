package day10forloops;

public class WhileLoop01 {
    public static void main(String[] args) {
        printDivBySixAndEight();
//
//        int i = 4;
//
//        while (i < 10) {
//            if (i % 2 == 0) {
//                System.out.println(i + " ");
//            }
//            i++;
//        }

        /*
        Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
         */


    }

    public static void printDivBySixAndEight() {
        int a = 500;

        while (a > 24) {
            if (a % 6 == 0 && a % 8 == 0) {
                System.out.print(a + " ");
            }
            a--;
        }
    }
}

