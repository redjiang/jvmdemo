package com.red;

public class MyTest1 {
    public static void main(String[] args) {

        /**
         *javap -c 类名
         * 助记符 ：
         * ldc：表示将int,float或是string类型的常量值从常量池中推送至栈顶
         * bipush：表示将单字节（-128~127）的常量值推送至栈顶
         * sipush：表示将短整型常量值（-32768-32767）的常量值推送至栈顶
         * inconst_1~inconst5:将int类型1~5推送至栈顶
         */
        System.out.println(MyGaga1.str2);
    }
}

class MyGaga1{
    /**
     * 这些主方法调用时会初始化类，执行静态代码块
     */
    //public static String str = "hello add";

    /**
     * 这里变成final后就不会初始化类了，没有主动使用，因为本质上调用类并没有直接使用定义常量的类
     * 因为常量会在编译时放入调用该常量的方法对应的类的常量池中，也就是说在编译完后删除调这个类，str2仍然可以使用
     * 用javap -c反编译该类时发现str2并没有在该类中，而是在Test1中
     */

    public static final String str2 = "Hello str2";
    static {
        System.out.println("static quoto");
    }
}