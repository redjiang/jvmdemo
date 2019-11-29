package com.red;

/**
 * 没有主动使用，不会初始化
 * 数组实例，类型是由jvm在运行期动态生成的
 *
 *  public static void main(java.lang.String[]);
 *     Code:
 *        0: iconst_1
 *        1: anewarray     #2                  // class com/red/TiTi
 *  javap可以看出，数组助记符为anewarray，表示创建一个引用类型的数组，并将其引用值压入栈顶
 *  newarray是创建一个基本类型的数组，将其引用值压入栈顶int [I boolean[Z
 */
public class Test5 {
    public static void main(String[] args) {
        TiTi[] t1 = new TiTi[1];
        String[] i1 = new String[1];
        //输出，class [Lcom.red.TiTi;是运行时候jvm生成的,父类就是object，obj父类为null
        System.out.println();
    }
}
class TiTi{
    static {
        System.out.println("static block");
    }
}
