package Multithreading;


class threading extends Thread{  // extending the parent Thread class.
    // override the run method which is in parent class thread;

    @Override
    public void run() {
        for(int i=0;i<5;i++){
           // System.out.println(threading.currentThread());  // gives current details of the threads in java;
            System.out.println("child thread executing");
        }
    }
    // this is how we create a thread, now to execute the thread we will create a object in main class.
}
public class demothreading {
    public static void main(String[] args) {
       // threading t1 = new threading();
        threading t2 = new threading();
        t2.start();
        for(int i=0;i<5;i++){
          //  System.out.println(threading.currentThread()); // gives current details of the thread
            System.out.println("main thread executing");
        }

        // the output will be mixed with "mixed thread..." and "child thread ..." because the sequence of thread,
        // execution is determined by the thread schedular of  operating systems.
        // hence,  the output sequence of the multithreading cannot be predicted;

    }
}
