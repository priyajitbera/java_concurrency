package com.priyajit.concurrency.thread.creation;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread: by implementing Runnable interface");
    }
}
