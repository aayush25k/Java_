package Oops_Concept.staticExample;

// what is static variable ?
// 
public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // static keyword is used for an entity which is applicable to all objects in same way;

    human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary=salary;
        this.married = married;
        human.population += 1;
        //Since static is applicable to all objects in same way, then we don't have to use this keyword;
        // using this keyword will work but it is convention to use class name instead of this keyword;


    }
}
