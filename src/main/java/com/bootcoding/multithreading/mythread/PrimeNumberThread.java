package src.main.java.com.bootcoding.multithreading.mythread;

public class PrimeNumberThread extends Thread {
    public void run() {

        for (int j = 0; j < 100; j++) {

            int n = 99;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}