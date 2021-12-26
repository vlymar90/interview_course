package lesson3;

public class PingPong {
    private static final int COUNT = 10;
    final Object monitor = new Object();

    public void printPing() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < COUNT; i++) {
                    System.out.print("Ping");
                    monitor.notify();
                    monitor.wait();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < COUNT; i++) {
                    System.out.println("Pong");
                    monitor.notify();
                    if (i == COUNT - 1) {
                        Main.isEnd = true;
                    }
                    monitor.wait();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                System.exit(0);
            }
        }
    }
}
