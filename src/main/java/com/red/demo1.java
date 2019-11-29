package com.red;

public class demo1 {
    static {
        System.out.println("demo1");
    }
    public static void main(String[] args) {
        /**
         * 打印str时，只有直接使用的静态字段的类会初始化，
         * 也就是直接定义静态字段的类是被主动使用了，，就会调用Parent1的静态代码块方法
         * 而打印str2时，直接定义的子类的父类也会被主动使用，会被初始化，所以parent1
         * 的静态代码块也会在初始化时执行
         */


        System.out.println(Child1.str2);
    }
}
class Parent1{
    public static String str = "Hello1";
    static {
        System.out.println("parent static");
    }

}
class Child1 extends Parent1{
    public static String str2 ="childwe";
    static {
        System.out.println("child static");
    }
}