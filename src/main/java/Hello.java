package main.java;

public class Hello {
    public static void main(String[] args) {

        Cat vasyliy = new Cat("kartoplyna", 10);
        Cat vasyliy2 = new Cat("zyrab", 20);
        System.out.println(vasyliy2.introduce("Alex", 10));
        System.out.println(vasyliy2.introduce("Vova", 100));
        System.out.println(vasyliy.introduce("Vova"));
        System.out.println(vasyliy.introduce());

    }
}
