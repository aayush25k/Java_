/*
You are developing a simple calculator program. Implement a method
calculate(int num1,  num2, String operator) that performs basic
arithmetic operations (addition, subtraction, multiplication, division). Handle
exceptions for invalid operators and division by zero. Use custom exceptions
where appropriate.

 */

package Questions.ExceptionsHandling;
import java.util.*;

class InvalidOperator extends Exception{
    public InvalidOperator(String msg){
        super(msg);
    }
}
public class q1 {
    public static void Calculate(int num1,int num2,String operation) throws InvalidOperator {
        char op = operation.charAt(0);
        if(op =='*'|| op =='+'|| op =='-'|| op =='/'){
            if (op == '+') {
                System.out.println(num1+num2);
            }
            if (op == '*') {
                System.out.println(num1*num2);
            }
            if (op == '/') {
                if(num2==0){
                    throw new ArithmeticException("divide by 0");
                }else{
                    System.out.println(num1/num2);
                }

            }
            if (op == '-') {
                System.out.println(num1-num2);
            }
        }else{
            throw new InvalidOperator("you are giving an invalid operator");
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("enter num1");
            int a = in.nextInt();
            System.out.println("enter num2");
            int b = in.nextInt();
            System.out.println("enter the operation");
            String s = in.next();
            Calculate(a,b,s);
        }catch(InvalidOperator e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("divide by zero");
        }


    }
}
