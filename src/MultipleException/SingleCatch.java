package MultipleException;
import java.util.Scanner;
public class SingleCatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            try{
                System.out.println("enter a value: ");
                int num=Integer.parseInt(sc.nextLine());
                System.out.println("enter a divisior: ");
                int div=Integer.parseInt(sc.nextLine());
                int rsult=num/div;
                System.out.println("The result is:"+rsult);
            }
            catch(ArithmeticException|NumberFormatException e){
                System.out.println("ERROR....! "+e.getMessage());
            }

    }

}
