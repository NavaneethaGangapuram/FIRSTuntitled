import java.util.Scanner;

public class factors {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=scan.nextInt();
        System.out.println("factors of "+a+" are");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                {
                System.out.println(i);
                }
        }

    }
}
