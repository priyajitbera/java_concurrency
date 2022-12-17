package com.priyajit.concurrency.thread;

public class ThreadExample {

    public static void main(String[] args){
        // creating new thread using Thread class
        Thread thread1 = new Thread();

        // creating new thread by extending Thread Class
        Thread thread2 = new MyThread();

        // creating new thread by implementing Runnable interface
        Thread thread3 = new Thread( new MyRunnable() );

        // using lambda expression,
        // as Runnable is functional interface
        Thread thread4 = new Thread(()->{
            System.out.println("Thread: by implementing Runnable interface" +
                    ", with lambda expression");
        });

        // start above defined threads
        thread1.start(); // this thread doesn't do anything
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
/*
stdout:

"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60642:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Projects\Java\personal_projects\java_thread\target\classes com.priyajit.concurrency.thread.ThreadExample
Thread: by extending Thread Class
Thread: by implementing Runnable interface, with lambda expression
Thread: by implementing Runnable interface

Process finished with exit code 0
*/