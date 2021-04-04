package task1;

public class Director extends Person {

    public Director(String name, int age) {
        super(name, age);
    }

    public void startOfClasses() {
        System.out.println(name + " объявил начало занятий.");
    }

    public void stopOfClasses() {
        System.out.println(name + " объявил окончание занятий.");
    }
}
