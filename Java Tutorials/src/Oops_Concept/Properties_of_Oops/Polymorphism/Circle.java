package Oops_Concept.Properties_of_Oops.Polymorphism;

// when same method is present in parent as well as child class then it is called overriding;

public class Circle extends Shapes{

    //the area() will run when the object of circle is created ;
    // hence it is overriding
    @Override  // this symbol is annotation and used to check if a method is overridden or not;
    void area(){
        System.out.println("area is =  3.14*r*r");
    }
}
