package andi.com;

import static andi.com.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread ...");

        // When you run the thread several times create a subclass of thread
        // every time you want to run you have to instantiate
        Thread anotherTread = new AnotherThread();
        anotherTread.start();

        // anonymous class thread
        new Thread() {
            public void run() {
                System.out.println(ANSI_BLUE + "Hello from the anonymous class thread ...");
            }
        }.start();

        System.out.println(ANSI_RED + "Hello again from the main thread ...");

        // Runnable with interface
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        Thread myAnonymusRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymus class' s implementation");
            }
        });


    }
}
