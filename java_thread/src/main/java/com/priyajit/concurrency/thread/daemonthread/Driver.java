package com.priyajit.concurrency.thread.daemonthread;

public class Driver {

    public static void main(String[] args){
        MyThread thread1 = new MyThread();
        thread1.setDaemon(true);
        thread1.start();
        try {
            // main thread will sleep for 5s
            // after than that JVM will terminate
            // as thread1 is marked daemon
            // * we can invoke thread1.join() method, so that main thread
            // waits for thread1 to finish
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After main thread slept for 5s");
    }
}
/*
stdout:
1 seconds, running...
2 seconds, running...
3 seconds, running...
4 seconds, running...
After main thread slept for 5s

Process finished with exit code 0
* */