package com.priyajit.concurrency.thread.memorymodel;

public class Driver {
    public static void main(String[] args){

        MyRunnable runnable = new MyRunnable();

        // same runnable instance is passed between two threads
        // since the MyObject instance is creating inside run() method
        // each thread will have its own object even though same runnable instance is passed
        // ** MyObject is not member to MyRunnable class here
        Thread thread1 = new Thread(runnable, "thread-1");
        Thread thread2 = new Thread(runnable, "thread-2");

        thread1.start();
        thread2.start();



    }
}
/*
stdout:
thread-2, com.priyajit.concurrency.thread.memorymodel.MyObject@2043a44a
thread-1, com.priyajit.concurrency.thread.memorymodel.MyObject@47e5070c

Process finished with exit code 0

* */
