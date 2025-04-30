package Oops_Concept;

public class WrapperClass {

    public static void main(String[] args) {
        int a = 10; // this is a primitive datatype which is stored in stack memory.
        a=2; // value of a primitive datatype can be changed;
        Integer b = 20; //this is a object of wrapper class;
        // b=100; this will give error because it cannot be modified
        A name = new A();
        System.out.println(name.name);
        A obj;
        for(int i=0;i<1000000;i++){
            obj=new A();
        }
    }
}

class A{
    final int NUM = 10;
    String name  = "aayush keshri";

    @Override
    protected void finalize() throws Throwable {
        System.out.println("this object has been destroyed");
    }
}

