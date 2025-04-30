package Oops_Concept.staticExample;

public class main {
    public static void main(String[] args) {
        human aayush = new human(19,"Aayush",120000,false);
        human tom = new human(34,"tom cruise",1500000,true);
        // if we access content of another file of same package then we don't have to import;
        System.out.println(aayush.name);
        //System.out.println(aayush.population); this is correct but convention method is to use class name;
        System.out.println(human.population); // this is the convention way to use a static variable;
    }
}
