package advanced.concurrencies;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("In my thread at step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
