package Oops_Concept.Abstract_Classes;

public class son extends Parent {
    @Override
    void career(){
        System.out.println("i want to be a charted accountant");
    }
    // all the abstract methods in the parent class must be overridden in the child class;
    @Override
    void partner() {
        System.out.println("i will marry a girl");
    }


    public son(){
        super(age);
    }
    }

