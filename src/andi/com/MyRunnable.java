package andi.com;

import static andi.com.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable interface ...");
    }
}
