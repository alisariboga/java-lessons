package day13constructors;

public class Dog {

    public String name;
    public int weight;
    public int height;

    /*
    - I created a constructor
    - The constructor has no any parameter
    - The constructor has nothing inside the body
    - That kind of constructors are same with the default constructor
    - Note: If you create a constructor Java deletes the "Default one"
     */


    public Dog() {
    }

    public Dog(String name) {
        this.name = name;

    }

    public Dog(int weight, int height) {

    }

    public Dog(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;


    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Joe");
        System.out.println(dog1.name);

        //Create a dog by using name, weight nad height

        Dog dog2 = new Dog("Jorge", 32, 12);
        System.out.println(dog2.name);
        System.out.println(dog2.weight);
        System.out.println(dog2.height);

    }

    public static void sound() {
        System.out.println("Dogs bark...");
    }
}
