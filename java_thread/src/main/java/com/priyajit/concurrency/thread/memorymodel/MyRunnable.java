package com.priyajit.concurrency.thread.memorymodel;

public class MyRunnable implements Runnable{


    @Override
    public void run(){
        MyObject myObject = new MyObject();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ", " + myObject);
    }
}
