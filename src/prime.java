import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for (int j = 1; j <= n; j++) {
            boolean b = true;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(j + " is a prime number");
            } else {
                System.out.println(j + " is not a prime number");
            }
        }
    }
}

