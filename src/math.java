import java.util.Scanner;
import java.lang.Math;

import static java.lang.Long.sum;
import static java.lang.Math.*;

public class math {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        System.out.println("maximum of two numbers: "+max(a,b));
        System.out.println("minimum of two numbers:  "+min(a,b));
        System.out.println("sum of two numbers: "+sum(a,b));
        System.out.println("square root of a number: "+sqrt(a));
        System.out.println("square root of a number: "+sqrt(b));
        System.out.println("power of a number: "+pow(a,b));
        float c=-23.3f;
        System.out.println("postive value: "+abs(c));

    }
}
