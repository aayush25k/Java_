package Oops_Concept;


import java.util.Scanner;
class Student1{
    int roll;
    String name;
//    public void changename(String newname){
//        name = newname;
//    }
//    public void message(){
//        System.out.println("hello "+ this.name);
//    }
    Student1(){
        //this is a default constructor
        // if we call a constructor with no arguments or parameters then it will call this constructor;
        this.name = "student";
        this.roll=000;


    }
    Student1(int rollno,String name){   //this is a parametrised constructor
                                        // if we call a constructor with parameters it will call this constructor
        this.roll = rollno;
        this.name=name;
}

    Student1(Student1 other){
        this.name = other.name;
        this.roll = other.roll;
    }
}

public class Constructors {
    public static void main(String[] args) {
        System.out.println("we will learn about constructors here");

          Student1 s1= new Student1(007,"AAYUSH");
          Student1 s2 = new Student1(005,"aaryan goli");
          Student1 random = new Student1(s1);
          Student1 random2 = new Student1(s2);
//          Student1 one = new Student1(001,"aakash");
//          Student1 two= one;
//          one.name = "changed to new one";
//        System.out.println(two.name);

//        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s2.name);
//        System.out.println(s2.roll);
        System.out.println(random.name);
        System.out.println(random.roll);

        System.out.println(random2.name);
        System.out.println(random2.roll);

    }
}
