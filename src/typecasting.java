import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer:");
        int num=sc.nextInt();
        float f=(float)num;
        double d=(double)num;
        System.out.println(f);
        System.out.println(d);



}
}