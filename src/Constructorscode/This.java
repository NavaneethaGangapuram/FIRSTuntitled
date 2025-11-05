package Constructorscode;

public class This {
    int a;
    String str;
    public This(int a,String str)
    {
        this.a=a;
        this.str=str;
    }
    public static void main(String args[])
    {
        This obj=new This(1,"HELLO");
        System.out.println(obj.a);
        System.out.println(obj.str);
    }
}
