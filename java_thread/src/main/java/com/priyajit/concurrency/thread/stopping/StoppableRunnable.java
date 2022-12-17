package com.priyajit.concurrency.thread.stopping;

public class StoppableRunnable implements Runnable{

    // flag to indicate is stop requested
    private boolean stopRequested = false;

    // method to enable stopRequested flag
    public synchronized void requestStop(){
        this.stopRequested = true;
    }

    // method to verify stopRequested flag
    public synchronized boolean isStopRequested(){
        return this.stopRequested;
    }

    @Override
    public void run(){
        int t = 0;

        // until stop is requested repeat
        while(!stopRequested){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            // print seconds passed
            System.out.println((++t)+" seconds ...");
        }
    }
}
