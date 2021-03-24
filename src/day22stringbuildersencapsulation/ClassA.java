package day22stringbuildersencapsulation;

/*
Encapsulation Task
1) Create class A
2) Create class B
3) Create a String, an int, and a boolean variable inside the class A and encapsulate them all
4) Make String variable just readable
5) Make int variable just updatable
6) Make Boolean variable both readable and updatable
 */

public class ClassA {
    private String name = "Ali";
    private int age = 16;
    private boolean isTrue = true;

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
