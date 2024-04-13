package Java.basics;

import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {


//    private int counter = 0;
//    public int getCounter() {
//        return counter;
//    }
//
//    public void incriment() {
//        counter++;
//    }
//public synchronized void incrimentSynchronized() {
//    counter++;
//}
    

    public int getCounter() {
        return counter.get();
    }

    public void incriment() {
        counter.incrementAndGet();
    }


    private AtomicInteger counter = new AtomicInteger(0);

}
public class Atomic {
    public static void main(String[] args) {

        SharedCounter sharedCounter = new SharedCounter();

        new Thread(()->{
            System.out.println("Thread 1 Started logic");
            for (int i=0;i<50000;i++){
                sharedCounter.incriment();
            }
            System.out.println("Thread 1 Completed logic");
        }).start();

        new Thread(()->{
            System.out.println("Thread 2 Started logic");
            for (int i=0;i<50000;i++){
                sharedCounter.incriment();
            }
            System.out.println("Thread 2 Completed logic");
        }).start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(sharedCounter.getCounter());
    }
}
