package com.red;

import java.util.Random;

/**
 * 张龙在深入理解jvm虚拟机第8讲时写到
 * 当一个接口在初始化时，并不要求其父接口都完成了初始化，
 * 只有在真正使用到父接口的时候（如引用接口中所定义的常量时）才会初始化，
 * 但实际我发现这个例子是将子接口的常量开始时就赋值为5，这样本来子接口就不会初始化了，
 * 放到常量池中了，如果将子接口也改为随机数，可以发现父接口的class被删掉也是要报错的
 */

public class MyTest6 {
    public static void main(String[] args) {
        System.out.println(Child.b);
    }
}

interface Parent{
    public static  final int a = new Random().nextInt(3);
}

class Child implements Parent{
    public static final int b = new Random().nextInt(3);
}
