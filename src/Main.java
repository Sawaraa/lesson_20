import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Thread
        MyThread myThread = new MyThread();
        myThread.start();
        //Runnable
        Runnable runnable = new RunnableThread();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}