package lesson3;

public class Main {
    public static volatile boolean isEnd = false;
    public static void main(String[] args) {
        new Thread(() -> {
            new Counter().countStart();
        }).start();
        PingPong pingPong = new PingPong();

        Thread t1 = new Thread(() -> {
            pingPong.printPing();
        });

        Thread t2 = new Thread(() -> {
            pingPong.printPong();
        });

        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        while (!isEnd) {
            Thread.onSpinWait();
        }
        System.exit(0);

    }
}
