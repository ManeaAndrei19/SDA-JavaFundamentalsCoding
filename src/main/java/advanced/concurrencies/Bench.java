package advanced.concurrencies;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat(Integer threadIndex) {
        if (availableSeats > 0) {
            System.out.println("Take a seat in thread: " + threadIndex
                    + "\nNumber of available seats left: " + --availableSeats);
        } else {
            System.out.println("No more seats remaining");
        }
    }

    public void printSynchronizedBlock(Integer threadIndex) {
        synchronized (this) {
            System.out.println("In synced block in thread: " + threadIndex);
        }
        System.out.println("Not synchronized code");
    }
}
