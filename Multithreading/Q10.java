package Multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q10 {
//     Write a Java program that processes a batch of images concurrently using multiple threads.
// Each thread should apply a specific image processing operation (e.g., resizing, filtering) to its
// assigned image. Use a thread pool to manage the execution of image processing tasks. Ensure that
// each image is processed only once by a single thread to avoid duplication or conflicts

public static void main(String[] args) {
    // Create a thread pool with 4 threads
    ExecutorService executor = Executors.newFixedThreadPool(4);

    // List of images to process
    List<String> images = Arrays.asList("image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg");

    // Submit tasks to the thread pool
    for (String image : images) {
        executor.submit(() -> processImage(image));
    }

    // Shutdown the executor after all tasks are completed
    executor.shutdown();
}

public static void processImage(String image) {
    // Simulate image processing
    System.out.println("Processing image: " + image);
    try {
        Thread.sleep(1000); // Simulate processing time
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Image processed: " + image);
}
}
