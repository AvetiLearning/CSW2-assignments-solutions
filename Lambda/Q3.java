package Lambda;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Q3 {
//     Write a program that demonstrates lazy evaluation by creating a lazy
// sequence of prime numbers. Define a lazy sequence using lambda expressions
// that generates prime numbers. Demonstrate lazy evaluation by printing the first
// few prime numbers from the lazy sequence

public static void main(String[] args) {
    IntSupplier primeSupplier = new IntSupplier() {
        int current = 1;
        @Override
        public int getAsInt() {
            current++;
            while (!isPrime(current)) {
                current++;
            }
            return current;
        }
    };

    IntStream.generate(primeSupplier).limit(10).forEach(System.out::println);
}

private static boolean isPrime(int num) {
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
