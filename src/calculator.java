import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        //this is used to take input from the user
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //here we can give integer
        int b = scan.nextInt();//here we can give integer
        String choice=scan.next();//here we can give string
        int c;


        switch(choice)
        {
            case "+":
                c=a+b;
                System.out.println("addition of two numbers is:"+c);
                break;
            case "-":
                c=a-b;
                System.out.println("subtraction of two numbers is:"+c);
                break;
            case "*":
                c=a*b;
                System.out.println("multiplication of two numbers is:"+c);
                break;
            case "/":
                c=a/b;
                if(b!=0){
                    System.out.println("division of two numbers is:"+c);
                }
                else{
                    System.out.println("division of two numbers is 0");
                }
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }
}
