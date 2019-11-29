package com.red;

import java.util.concurrent.*;

public class TestVolatile {
    private int x = 200;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        new TestVolatile().testm();
    }

    public void testm() throws InterruptedException {

        new Thread(()->{
            int j = 1;
            while(x==200) {
                for(int i=1;i<10000000;i++){

                    j=j*i;
                }
                //System.out.println(Thread.currentThread().getName()+"---"+x);

            }
        },"t2").start();
        Thread.sleep(100);
        new Thread(()->{
            x=201;
//            while(true) {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                //System.out.println(Thread.currentThread().getName()+"---"+x);
//                x =190;
//
//            }
        },"t1").start();

    }
}
