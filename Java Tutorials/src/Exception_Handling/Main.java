package Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
       // int c =a/b;
       // System.out.println(c);

        // this will give this error:-
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Exception_Handling.Main.main(Main.java:7)

        // if we want to handle this in a good way, we can do this by try-catch block;
        int c = 0;
        try{
             c=divide(a,b);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(c );






    }

     static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("don't divide by 0");
        }
        return a/b;
    }
}
