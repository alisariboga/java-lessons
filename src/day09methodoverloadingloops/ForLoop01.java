package day09methodoverloadingloops;

public class ForLoop01 {
    public static void main(String[] args) {
        numbersPrint();
        printNumber();
        divisionFive();


//        String hello = "Hello world";
//        int counter = 1;
//
//        if (counter < 10) {
//            counter++;
//            System.out.println(hello);
//            continue;
//        } else {
//            System.out.println("Try Again");
//            break;
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("hello world");
        }
    }

    public static void numbersPrint() {
        for (int i = 5; i <= 12; i++) {
            System.out.println(i);
        }


    }

    public static void printNumber() {
        for (int i = 12; i >= 5; i--) {
            System.out.println(i);
        }

    }

    public static void divisionFive() {
        for (int i = 100; i > 22; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

