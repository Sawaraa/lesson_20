import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел Фібоначчі: ");
        int num = scanner.nextInt();

        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < num; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for(int n : fib ){
            try {
                Thread.sleep(1000);
                System.out.println(n);
            } catch (InterruptedException e) {
            }
        }

    }
}
