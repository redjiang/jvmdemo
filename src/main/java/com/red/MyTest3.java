package com.red;

import java.util.UUID;

/**
 * 当一个常量并非编译期可以确定，就不会装载到类的常量池中,需要在运行时才能确定，常量的定义
 * 类就会初始化。
 */

public class MyTest3 {

    public static void main(String[] args) {

        System.out.println(MyParent3.str);
    }


}

class MyParent3{
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("MyParent3 static segement");
    }

}
