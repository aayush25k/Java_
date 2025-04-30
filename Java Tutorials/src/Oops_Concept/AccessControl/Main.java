package Oops_Concept.AccessControl;



public class Main {
    public static void main(String[] args) {
        Private obj = new Private();
//        System.out.println(obj.name);
//        System.out.println(obj.a);
        // both of this will show error as the name and a attribute are set to private.
        // hence we cant access it from any other class;
        obj.setA(55);
        int n = obj.getA();
        System.out.println(n);

        // now we are creating the object of public class;
        Public obj2 = new Public(101);
        System.out.println(obj2.var);  // this can be easily accessed;

        // we can access the public modifier from any other package, we just have to import and create object there.
        // example of this is shown in demo.java file;
        // the same can't be done with private access modifier;
        //

    }


}
