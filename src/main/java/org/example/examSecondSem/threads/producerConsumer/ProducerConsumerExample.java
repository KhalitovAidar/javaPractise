package org.example.examSecondSem.threads.producerConsumer;


import org.example.houseBuilding.CompletionOfConstruction;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    private static final int BUFFER_SIZE = 10;
    private static final Queue<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        consumer.start();
    }

    private static class Producer implements Runnable {
        @Override
        public void run() {
            int i = 1;
            while (true) {
                try {
                    produce(i++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private void produce(int item) throws InterruptedException {
            synchronized (buffer) {

                while(buffer.size() == BUFFER_SIZE) {
                    buffer.wait();
                }

                buffer.add(item);
                System.out.println("Producer produced: " + item);
                buffer.notify();
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {

            while (true) {
                try {
                    consume();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private void consume() throws InterruptedException {

            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    buffer.wait();
                }

                int item = buffer.remove();
                System.out.println("Consumer consumed: " + item);
                buffer.notify();
            }
        }
    }
}

