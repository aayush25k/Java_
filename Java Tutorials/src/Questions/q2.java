package Questions;
/*
Write a java program to check whether the static classes can contain non-static methods
or not. Also, prove that the methods of static class can be called without creating objects
of outer class.
 */


public class q2 {


    static class Sclass{
        public void print(){
            System.out.println("hello world");
        }
        public static void sum(){
            System.out.println("sum is =" + 30);
        }
    }
    public static void main(String[] args) {
        Sclass obj = new Sclass();
        obj.print();
        Sclass.sum();

    }
}
