package day23encapsulationinheritance;

public class Animal {

    public void eat() {
        System.out.println("They eat...");
    }

    public void drink() {
        System.out.println("They drink...");
    }

}

/*
1) Why do we need inheritance?
2) What are the benefits of inheritance?
    a)No repetition
    b)Less coding
    c)Easy update
    d)Easy maintenance
3) We store common class members (variables or methods) into Parent Class
4)We store specific class members into Child classes
5) Privateclass memebers in Parent Class cannot be used by Child Classes
6) If Child Class and Parent Class are in same package then Child Classes can use the default class
    members from in Parent Class
7) Child Classes can use all protected class members in Parent Class
Note:  For "public" and "protected" access modifiers inheritance works without any issue
Note: For private access modifiers there is no inheritance.
Note: For default access modifiers you should be careful.
NOTE:Java doesn't support multiple inheritance.

 */
