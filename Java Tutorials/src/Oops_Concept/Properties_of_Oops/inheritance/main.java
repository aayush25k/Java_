package Oops_Concept.Properties_of_Oops.inheritance;

public class main {
    public static void main(String[] args) {
        box_weight b1 = new box_weight(5,10,5,50);
        box b2 = new box_weight(2,4,5,6);
        // System.out.println(b2.weight);  this will give error;
        // in java the type of reference variable but not the object determines what members it can access;
        // here the b2 is of type box and its object is of type box_weight.
        // hence it can only access the members of the box class ie h,b,l;
        // if we try to access the weight property from b2 then it will give error as it a property of box_weight;


        System.out.println(b1.h*b1.w*b1.l+" "+ b1.weight);
    }

    /*
    what are the types of inheritance?
    1. single inheritance:- example the box_weight inherits box class;
    2. multilevel inheritance:- if another class something like box_colour inherits box_weight,
       then it will be a multilevel inheritance.
    3. multiple inheritance:- when a class is inherited by more than one parent class;
       java does not support multiple inheritance;
    4. heirarchial inheritance:- when a class is inherited by multiple child classes;
    5. hybrid inheritance:- combination of single and multiple inheritance;

     */
}
