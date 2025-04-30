package Multithreading.Threads;

import Multithreading.demoMythread;

public class threadPriority implements  Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
        }
    }

}

class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new threadPriority(),"thread 1");
        Thread t2 = new Thread(new threadPriority(),"thread 2");
        System.out.println("t1 ka priority"+ t1.getPriority());
        System.out.println("t2 ka priority"+ t2.getPriority());
        // by default the priority given to the threads are in range of (1-10);
        // by default the default priority value given to the thread is 5;
        // we can change the priority of the threads according to our needs;
      //  t1.setPriority(Thread.MAX_PRIORITY); // this will set the thread to minimum priority ie 1;
        t1.setPriority(6);
        // we can also pass numeric value in range of 1-10;
        System.out.println("changed priority of t1 is "+t1.getPriority());
         t1.start();
         t2.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
        }
    }
}

