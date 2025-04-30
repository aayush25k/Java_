package Multithreading;

public class demoMythread implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("child thread");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Thread t = new Thread(new demoMythread());
        t.setName("seth");
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
            System.out.println("Main thread");
        }

    }
}
