package Multithreading;

public class Q6 {
//     Write a Java program that generates prime numbers up to a given limit using multiple
// threads. Each thread should generate a subset of the prime numbers


public static void main(String[] args){
    int limit = 100;
    int numThreads = 4;
    Thread[] threads = new Thread[numThreads];
    for (int i = 0; i < numThreads; i++) {
        int start = i * limit / numThreads;
        int end = (i + 1) * limit / numThreads;
        threads[i] = new Thread(() -> {
            for (int j = start; j < end; j++) {
                if (isPrime(j)) {
                    System.out.println(j);
                }
            }
        });
        threads[i].start();
    }
}
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}