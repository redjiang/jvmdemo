package com.red;

/**
 * new一个类的实例，就会主动使用
 */
public class Test4 {
    public static void main(String[] args) {
        CoCo co = new CoCo();
    }
}

class CoCo{
    static {
        System.out.println("static block");
    }
}
