package MultipleException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value: ");
        int a=sc.nextInt();
        System.out.println("enter b value: ");
        int b=sc.nextInt();
        try{
            int[] values={1,2,3,4,5,6};
            System.out.println("The numbers are: "+values[9]);
            int c=a/b;
            System.out.println("the division of two numbers i.e "+a+" and "+b+" = "+c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter the values between 1 to 6 "+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Please check the code "+e.getMessage());
        }
    }
}
