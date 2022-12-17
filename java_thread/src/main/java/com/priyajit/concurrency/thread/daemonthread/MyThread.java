package com.priyajit.concurrency.thread.daemonthread;

public class MyThread extends Thread{

    @Override
    public void run(){
        int t = 0;
        // run for infinitely
        // (this thread will be marked daemon so JVM doesn't wait for its completion)


        while(true){
            try{
                Thread.sleep(1000);
                System.out.println((++t) + " seconds, running...");
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
