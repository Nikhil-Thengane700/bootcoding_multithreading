package src.main.java.com.bootcoding.multithreading.mythread;

public class FibonacciThread extends  Thread{
    public void run(){


        for (int i = 0; i < 100; i++) {

            int n = 10; // number of terms to print
        int a = 0; // first term
        int b = 1; // second term
        System.out.println("The Fibonacci sequence is:");
        for (int j = 0; j < n; j++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}}
