package Oops_Concept.AccessControl;

public class Private {
// private access modifier cannot be accessed from anywhere except the class/file itself
    private int a ;
    private String name;

    public Private(int a, String name) {
        this.a = a;
        this.name = name;
    }
    public Private(){}

    public int getA() {
        return a;
    }
    public void setA(int n){
        this.a = n;
    }

}
