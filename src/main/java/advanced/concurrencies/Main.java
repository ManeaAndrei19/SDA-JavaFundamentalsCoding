package advanced.concurrencies;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /** Concurrency synchronization
         */

        Bench bench = new Bench(1);
        SeatsTakerThread seatsTakerThread1 = new SeatsTakerThread(bench, 1);
        SeatsTakerThread seatsTakerThread2 = new SeatsTakerThread(bench, 2);

        seatsTakerThread1.start();
        seatsTakerThread2.start();


        /**Concurrency extending Thread class

         MyThread myThread = new MyThread();
         MySecondThread mySecondThread = new MySecondThread();
         Thread theSecondThread = new Thread(mySecondThread);
         myThread.start();
         theSecondThread.start();


         System.out.println("Main thread starts here!");
         Thread.sleep(1000);
         System.out.println("Main thread is still running");
         Thread.sleep(6000);
         System.out.println("Main thread ends here");

         */


    }
}
