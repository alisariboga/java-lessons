package day22stringbuildersencapsulation;

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
