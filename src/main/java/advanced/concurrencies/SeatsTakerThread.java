package advanced.concurrencies;

public class SeatsTakerThread extends Thread {
    private Bench bench;
    private int threadIndex;

    public SeatsTakerThread(Bench bench, Integer threadIndex) {
        this.bench = bench;
        this.threadIndex = threadIndex;
    }

    @Override
    public void run() {
        bench.takeASeat(threadIndex);
        bench.printSynchronizedBlock(threadIndex);

    }
}
