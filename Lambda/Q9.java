package Lambda;

class BoundedBuffer{
    private int[] buffer;
    private int size;
    private int in = 0;
    private int out = 0;
    private int count = 0;

    public BoundedBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public synchronized void put(int value) throws InterruptedException {
        while (count == size) {
            wait();
        }
        buffer[in] = value;
        in = (in + 1) % size;
        count++;
        notifyAll();
    }

    public synchronized int take() throws InterruptedException {
        while (count == 0) {
            wait();
        }
        int value = buffer[out];
        out = (out + 1) % size;
        count--;
        notifyAll();
        return value;
    }

}

public class Q9 {
//     Write a program that implements the producer-consumer problem using
// lambda expressions and threads. Define a bounded buffer class that implements
// a queue. Create producer and consumer classes that use lambda expressions to
// produce and consume items from the bounded buffer. Create and start multiple
// producer and consumer threads to demonstrate the producer-consumer problem

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(5);
        Runnable producer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable consumer = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(buffer.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread producer1 = new Thread(producer);
        Thread producer2 = new Thread(producer);
        Thread consumer1 = new Thread(consumer);
        Thread consumer2 = new Thread(consumer);
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
