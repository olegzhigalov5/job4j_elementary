package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
//package ru.job4j.calculator;

//public class Calculator {

    //public static void main(String[] args) {
      //  int two = 2;
        //int six = 6;
        //int four = 4;
        //int five = 5;
        //int sixDivTwo = six / two;
        //int fiveMinusTwo = five - two;
        //int fourTimeTwo = four * two;
        //System.out.println(sixDivTwo);
        //System.out.println(fiveMinusTwo);
        //System.out.println(fourTimeTwo);
    //}
//}