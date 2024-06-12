package Multithreading;

public class Q4 {
//     Implement a program where two threads communicate with each other using wait() and
// notify() methods. One thread should print even numbers, and the other should print odd numbers in
// sequence.

    public static void main(String[] args) {
        Object lock = new Object();
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i <= 10; i += 2) {
                    System.out.println(i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println(i);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
