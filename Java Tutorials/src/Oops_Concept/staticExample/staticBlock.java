package Oops_Concept.staticExample;



public class staticBlock {
    static int a = 10;
    static int b;

    static{
        // called only once when the first obj is created ie. when the class is loaded for the first time;
        System.out.println("this is a static block");
        b = a*10;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a);
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.b);

    }
}
