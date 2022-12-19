package com.priyajit.concurrency.thread.memorymodel;

public class DriverShared {
    public static void main(String args[]){

        MyRunnableShared myRunnableShared = new MyRunnableShared();
        Thread thread3 = new Thread(myRunnableShared, "thread-3");
        Thread thread4 = new Thread(myRunnableShared, "thread-4");
        thread3.start();
        thread4.start();
    }
}
/*
stdout:
thread-4, com.priyajit.concurrency.thread.memorymodel.MyObject@673caf4b
thread-3, com.priyajit.concurrency.thread.memorymodel.MyObject@673caf4b

Process finished with exit code 0
*/