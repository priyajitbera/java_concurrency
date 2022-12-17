package com.priyajit.concurrency.thread.stopping;

public class Driver {
    public static void main(String[] args){

        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable);
        thread.start();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}
/*
stdout:

"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61312:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Projects\Java\java_concurrency\java_thread\target\classes com.priyajit.concurrency.thread.Driver
1 seconds ...
2 seconds ...
3 seconds ...
4 seconds ...
requesting stop
stop requested
5 seconds ...

Process finished with exit code 0
*/