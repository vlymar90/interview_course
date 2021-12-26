package lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    final ReentrantLock lock = new ReentrantLock();
    volatile int count = 0;
    private final int MAX_COUNT = 10;

    public void countStart() {
        try {

            lock.lock();
            while (count < MAX_COUNT) {
                count++;
                System.out.println(count);
            }
        } finally {
            lock.unlock();
        }
    }
}
