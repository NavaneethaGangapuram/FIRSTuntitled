public class overloading {
    static void method()
    {

        System.out.println("hello");
    }
    static int method(int a,int b)
    {

        return a+b;
    }
    static int  method(int age,String name) {
        System.out.println("age"+age+"name"+name);
        return age;
    }
    static String method(String str1,String str2)
    {
        return str1+str2;
    }
    static int method(int a,int b,int c)
    {
        return a+b+c;
    }
public static void main(String[] args)
{
    method();
    int z=method(1,2);
    System.out.println("The addition of two numbers is:"+z);
    method(1,4,9);
    System.out.println("the addition of three numbers is: "+method(1,4,9));
    int z1=method(20,"navaneetha");
    System.out.println(z1);
    String str3="navan"+"eetha";
    System.out.println(str3);

}
}
