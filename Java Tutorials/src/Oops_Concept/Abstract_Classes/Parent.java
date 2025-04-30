package Oops_Concept.Abstract_Classes;

abstract class Parent { // class containing one or more abstract methods should also be an abstract;

    static int age;
    abstract void career(); // this is an abstract method;
    abstract void partner();
    public static void printName(){
        System.out.println("hello parent");

    }
    public Parent(int age){
        this.age = age;
    }


}
