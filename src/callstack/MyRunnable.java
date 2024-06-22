package callstack;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
