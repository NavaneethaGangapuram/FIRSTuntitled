import java.util.Scanner;

public class onlinepayment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("google pay");
        System.out.println("phone pay");
        System.out.println("paytm");
        System.out.println("credit card");
        System.out.println("enter the payment type: ");
        String name = sc.nextLine();
        System.out.println("enter the amount to be paid: ");
        int a = sc.nextInt();
        System.out.println("thanks for the payment");
        System.out.println("the payment "+a+" paid from "+name);
    }

}
