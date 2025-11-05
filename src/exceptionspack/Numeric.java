package exceptionspack;
import java.util.Scanner;

public class Numeric {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        try{
            int div=a/b;
            System.out.println("the division of "+a+" and "+b+" is: "+div);
        }
        catch(ArithmeticException e){
            System.out.println("something went wrong "+e.getMessage());
        }
        finally{
            System.out.println("successfully completed");
        }

    }
}
