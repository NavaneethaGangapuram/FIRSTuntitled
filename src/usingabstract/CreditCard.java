package usingabstract;

public class CreditCard  extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("thanks for payment");
        System.out.println("payment amount "+amount+" paid from Credit Card");
    }
}
