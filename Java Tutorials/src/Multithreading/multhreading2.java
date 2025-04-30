package Multithreading;
// in this we will see multithreading using implementing runnable class
public class multhreading2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("runnable");
        }
    }


}
class test{
    public static void main(String[] args) {
        multhreading2 m = new multhreading2();
        Thread t = new Thread(m);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("main class");
        }
    }
}
