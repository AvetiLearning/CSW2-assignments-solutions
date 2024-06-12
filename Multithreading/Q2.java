package Multithreading;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Q2 {
//     Write a Java program that uses reactive programming to read a file asynchronously. Use RxJava
// or another reactive library to handle the file reading and processing

    public static void main(String[] args) {
       Observable <String> observable = Observable.create(emitter -> {
           try {
               BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
               String line;
               while ((line = reader.readLine()) != null) {
                   emitter.onNext(line);
               }
               reader.close();
               emitter.onComplete();
           } catch (IOException e) {
               emitter.onError(e);
           }
       });

         observable.subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println, Throwable::printStackTrace);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
