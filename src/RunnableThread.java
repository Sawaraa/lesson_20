import java.util.Scanner;

public class RunnableThread implements  Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел Фібоначчі: ");
        int n = scanner.nextInt();

        int[] fibSequence = new int[n];
        fibSequence[n - 1] = 0;
        fibSequence[n - 2] = 1;

        for (int i = n - 3; i >= 0; i--) {
            fibSequence[i] = fibSequence[i + 2] + fibSequence[i + 1];
        }

        for(int num : fibSequence ){
            try {
                Thread.sleep(1000);
                System.out.println(num);
            } catch (InterruptedException e) {
            }
        }
    }
}
