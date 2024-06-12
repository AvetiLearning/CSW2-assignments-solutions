package Multithreading;

import java.util.concurrent.CompletableFuture;


public class Q7 {
//     Implement a Java program that demonstrates the use of CompletableFuture to perform
// asynchronous tasks and handle their results. Create CompletableFuture instances to perform tasks
// such as fetching data from a remote server or processing a large file asynchronously. Use
// thenApply() or thenCombine() to combine the results

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });

        future.thenApply(result -> {
            return result * 2;
        }).thenAccept(System.out::println);
    }
}
