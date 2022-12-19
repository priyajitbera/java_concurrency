package com.priyajit.concurrency.thread.memorymodel;

public class MyRunnableShared implements Runnable{

    // myObject instance is created when MyRunnable is instantiated
    // i.e done in main thread, the same myObject object is shared across threads
    // its created on the heap space
    private MyObject myObject = new MyObject();;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+", " + myObject);
    }
}
