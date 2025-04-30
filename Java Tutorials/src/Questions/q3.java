package Questions;
/*
Write a Java program to demonstrate that the static block of a class is executed before the
main method when the class is loaded.
 */
public class q3 {
    static {
        System.out.println("this is a static block");
    }

    public static void main(String[] args) {
        System.out.println("this is the main method");
    }
}
