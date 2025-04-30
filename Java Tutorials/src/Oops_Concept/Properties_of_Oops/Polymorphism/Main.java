package Oops_Concept.Properties_of_Oops.Polymorphism;

// what is polymorphism?
/*
    polymorphism is a act of representing a same thing in multiple ways;
    Eg:- the method area is same in all the class but its function is different;
        similarly when we make constructor with different parameters, is also a polymorphism;
 */

/*
Types of Polymorphism:-
 1.    compile time or static polymorphism:- achieved via method overloading/operator overloading;
       method overloading:- when a class is having multiple methods with same name but the parameters and the return type can be different;
 */
public class Main {


    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square sq = new Square();
        Circle circle = new Circle();

        shape.area();
        sq.area();
        circle.area();


    }
}
