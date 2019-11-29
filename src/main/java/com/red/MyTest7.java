package com.red;


/**
 *此例子主要是说明初始化是按顺序进行的，当准备阶段时，jvm给每个变量赋默认值，初始化阶段时才开始按顺序赋初值，
 * 如果A在B前面，则输出1，1，如果B在A前面则输出1，0
 */

public class MyTest7 {
    public static void main(String[] args) {
        System.out.println(Singleton.count1);
        System.out.println(Singleton.count2);
    }
}

class Singleton{
    public static int count1;
    public static int count2=0;//A
    public static Singleton instance = new Singleton();//B
    private Singleton(){
        count1++;
        count2++;
    }


    public static Singleton getInstance(){
        return instance;
    }

}