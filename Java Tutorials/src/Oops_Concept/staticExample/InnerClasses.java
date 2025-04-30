package Oops_Concept.staticExample;

 public class InnerClasses {
  // class inside a class is called a InnerClass;
  // in case of inner class the outside class cannot be static;
     static class demo{   // making this class static means that now the demo class is not dependent on the instances of the
                            // the parent class ie InnerClasses;
         int roll;
         demo(){

         }
         demo(int roll){
             this.roll = roll;
         }
     }

     public static void main(String[] args) {
        // demo d = new demo(007);   this will show error because the class demo is dependent on the outer class and
         // also we cannot access not static instance from a static one(psvm is static).
         // to access demo class from a main method, we have to make demo static;

         demo d = new demo(007);
         System.out.println(d.roll);

     }
 }
