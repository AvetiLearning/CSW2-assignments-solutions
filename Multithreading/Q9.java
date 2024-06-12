package Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Q9 {
//     Write a Java program that processes a large text file using multiple threads. Each thread
// should read a portion of the file, process it (e.g., count words, find specific patterns), and then
// merge the results to get the final output. The program should use a thread-safe data structure (e.g.,
// ConcurrentHashMap) to store intermediate results from each thread. Use synchronization
// mechanisms to ensure that each thread processes a unique portion of the file.
private static final String FILE_PATH = "path/to/your/text/file.txt"; // Replace with your file path
    private static final int NUM_THREADS = 4; // Number of threads to use

    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> wordCounts = new ConcurrentHashMap<>();

        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                    String line;
                    int lineNumber = 0;
                    while ((line = reader.readLine()) != null) {
                        lineNumber++;
                        if (lineNumber % NUM_THREADS == threadId) {
                            Arrays.stream(line.split("\\s+"))
                                    .forEach(word -> wordCounts.merge(word, 1, Integer::sum));
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
