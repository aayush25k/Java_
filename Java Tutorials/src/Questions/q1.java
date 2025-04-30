package Questions;
//Using a java code example, demonstrate that static methods can only access static data
//members, whereas non-static methods can access both static and non-static data
//members.

public class q1 {
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d=40;

    public void sum(){
        System.out.println("the sum of a and b are = "+(a+b));
        System.out.println("the sum of c and d are = "+(c+d));
        // this shows that the non static method can access both static and non static variables;
    }

    public static void sum1(){
        System.out.println("the sum of a and b are = "+(a+b));
       // System.out.println("the sum of c and d are = "+(c+d));
    }

    public static void main(String args[]){
        System.out.println(a+b);
       // System.out.println(c+d); // this will give error

        q1 obj = new q1();
        obj.sum();



    }
}
