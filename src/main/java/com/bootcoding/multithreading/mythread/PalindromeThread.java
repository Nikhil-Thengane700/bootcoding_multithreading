package src.main.java.com.bootcoding.multithreading.mythread;

public class PalindromeThread extends Thread {

    public void run(){



        for (int i = 0; i < 100; i++) {


        int number = 121;
        int reverse = 0;
        int temp = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (temp == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }

    }}


