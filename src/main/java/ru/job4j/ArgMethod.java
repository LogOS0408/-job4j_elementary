package ru.job4j;
public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello," + name + "age = " + age);

    }

    public static void main(String[] agrs) {
        String name = "Jab4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}