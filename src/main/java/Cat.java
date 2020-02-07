package main.java;

public class Cat extends Animal {

    public Cat(String name, int aAge) {
        System.out.println("New cat was created");
        this.name = name;
        this.age = aAge;
        this.count++;
    }

    public Cat(String name) {
        System.out.println("New cat was created");
        this.name = name;
        age = 1;
        this.count++;
    }

    public Cat() {
        System.out.println("New cat was created");

    }

    String color = "white";
    String name;
    static int count = 0;

    private int age;
    public void setAge(int age) {
        if (age <= 0 || age > 20) {
            System.out.println("Error");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        if (age <= 0 || age > 20) {
            return 0;
        } else {
            return this.age;
        }
    }

    static void resetCount() {
        count = 0;
    }



    String introduce(String userName, int number) {
        return "Hello " + userName + ", my name is " + name +" "+ number;
    }

    String introduce(String userName) {
        return "Hello " + userName + ", my name is " + name;
    }

    String introduce() {
        //return String.format("Hello %s my name is %s", name, this.name);
        return "Hello, my name is " + name + ". My color is " + color;
    }


}
