package andi.com;

import static andi.com.ThreadColor.ANSI_BLUE;
import static andi.com.ThreadColor.ANSI_CYAN;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_CYAN +"Hello now from another thread - going to sleep");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "another thread woke me up");
        }
        System.out.println(ANSI_CYAN + "three seconds have passed since I am awaked ...");
    }
}
