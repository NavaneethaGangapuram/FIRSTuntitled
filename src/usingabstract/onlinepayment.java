package usingabstract;
import java.util.Scanner;

public class onlinepayment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("GooglePay");
        System.out.println("PhonePay");
        System.out.println("Paytm");
        System.out.println("Credit Card");
        System.out.println("enter the payment type:");
        String name=sc.nextLine();
        System.out.println("enter the amount to be paid:");
        int amount=sc.nextInt();
        Payment p=null;
        switch (name){
            case "GooglePay":
                p=new GooglePay();
                break;
            case "PhonePay":
                p=new PhonePay();
                break;
            case "Paytm":
                p=new Paytm();
                break;
            case "Credit Card":
                p=new CreditCard();
                break;
            default:
                System.out.println("invalid");
                break;
        }
        p.pay(amount);

    }
}
