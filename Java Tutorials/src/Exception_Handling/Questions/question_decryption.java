package Exception_Handling.Questions;
import java.util.*;
/*
You are required to write a Java program that processes two numbers, "N" and "R",
based on a decryption mechanism used by an intelligence agency. The mechanism
repeatedly sums the digits of the number "N" for "R" iterations. After completing
the iterations, the result is reduced to a single digit.
If R = 0, throw a custom exception ZeroNumberException and display the
message: "R value cannot be zero."
 */
class ZeroNumberException extends Exception{
    public ZeroNumberException(String msg){
        super(msg);
    }
}
public class question_decryption{
    public static int sum(int Num){
        int sum =0;
        while(Num>0){
            sum +=Num%10;
            Num=Num/10;
        }
        return sum;
    }

    public static int ProcessNumber(int N,int R) throws ZeroNumberException{
        if(R==0){
            throw new ZeroNumberException("R cannot be zero");
        }
        int value=N;
        for(int i=0;i<R;i++){
            value = sum(value);
        }
        while(value>=10){
            value = sum(value);
        }
        return value;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            int N,R;
            System.out.println("enter the value of N");
            N=in.nextInt();
            System.out.println("enter the value of R");
            R = in.nextInt();

            int answer = ProcessNumber(N,R);
            System.out.println("the answer is "+ answer);

        } catch (ZeroNumberException e) {
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("invalid Input, Please enter valid Numbers");
        }

    }

}
