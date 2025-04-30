package Oops_Concept;

import Oops_Concept.AccessControl.Public;

public class demo {


    public static void main(String[] args) {

        System.out.println("learning oops");
        //Student[] students = new Student[5];
        Student student1 = new Student();
        Student s2 = new Student();
        student1.rollno = 007;
        student1.name = "aayush keshri";
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        // below is example of public access modifer,ie explained in AccessControl.Public
        Public obj = new Public(500);
        System.out.println(obj.var);
        // the example ends here;

    }

}
class Student{
    int rollno ;
    String name;

    Student (){

    }

}
