package Multithreading.Synchronisation;


class Counter{
    private int count =0;

    public synchronized void incerement(){
        count++;
    }
    /*
        without the synchronisation keyword, both thread will run concurrently that can cause race condition.
        this will lead to data inconsistency as one data is shared among multiple threads.
        To prevent this Synchronisation is used.
        Synchronisation ensures that if one thread is using a resource then no other thread will get access
        to the same resource until the previous thread has completed its task.
     */
    public int getCount() {
        return count;
    }
}


class CountThread extends Thread{
    private Counter counter;
    public CountThread(Counter dcounter){
        this.counter = dcounter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.incerement();
        }
    }
}
public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CountThread t1 = new CountThread(counter);
        CountThread t2 = new CountThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCount());

    }
}
