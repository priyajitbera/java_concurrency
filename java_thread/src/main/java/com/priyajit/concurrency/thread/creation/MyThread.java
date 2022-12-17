package com.priyajit.concurrency.thread.creation;

public class MyThread extends  Thread{
    @Override
    public void run(){
        System.out.println("Thread: by extending Thread Class");
    }
}
