package Multithreading.threadRunPrevention;

public class YeildDemo implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
            System.out.println("child Thread");
           // Thread.yield();



        }
    }
}

class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new YeildDemo(),"thread 1");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState()); 

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
            System.out.println("Main Thread");

        }


    }
}
