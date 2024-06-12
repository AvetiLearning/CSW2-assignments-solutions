package Multithreading;

import java.util.concurrent.locks.*;

public class Q5 {
//     Implement a program that demonstrates the use of locks (e.g., ReentrantLock) for thread
// synchronization. Create a scenario where multiple threads access a shared resource, and use locks to
// ensure that only one thread can access the resource at a time

private static final int NUM_THREADS = 5;
private static final int NUM_ITERATIONS = 1000;

private static int sharedResource = 0;
private static final Lock lock = new ReentrantLock();

public static void main(String[] args) {
    // Create and start multiple threads
    Thread[] threads = new Thread[NUM_THREADS];
    Runnable worker = () -> {
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            lock.lock(); // Acquire the lock
            try {
                sharedResource++; // Access the shared resource
            } finally {
                lock.unlock(); // Release the lock in finally block to ensure it's always released
            }
        }
    };
    for (int i = 0; i < NUM_THREADS; i++) {
        threads[i] = new Thread(worker);
        threads[i].start();
    }

    // Wait for all threads to finish
    for (Thread thread : threads) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Output final value of shared resource
    System.out.println("Final value of shared resource: " + sharedResource);
}
}