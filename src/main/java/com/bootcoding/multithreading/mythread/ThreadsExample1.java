package src.main.java.com.bootcoding.multithreading.mythread;


public class ThreadsExample1 {
    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new FibonacciThread();
        t1.start();

        Thread t2 = new PalindromeThread();
        t2.start();

        Thread t3 = new PrimeNumberThread();
        t3.start();


    }
}
