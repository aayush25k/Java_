package Oops_Concept.staticExample;

public class static1 {
    static int count;
    public static void main(String[] args) {
        //message(); // this will give error as a non static method or a variable cannot be called or used in a static class;
        sum(10,20); // only static methods will be entertained in static method ;

        // to use a non-static method in a static method we have to make object of the class first;
        static1 obj = new static1();
        obj.message();
         int age = 20;

         for(int i=0;i<5;i++){
             count++;
         }
        System.out.println(count);
    }
    // we also dont use this keyword in static classes or methods.
    // as this usually represents and obj and static dont depend on any object or instance.

    public void message(){
        System.out.println("hello world");
    }

    public static void sum(int a,int b){

        System.out.println(a+b);
    }
}
