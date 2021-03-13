package day12dowhilevariablesconstructors;

public class MyClass {
    public static void main(String[] args) {
        int num = 10;
        do {
            System.out.println(num-- + " " + num);
        } while (num == 0);


    }
}
