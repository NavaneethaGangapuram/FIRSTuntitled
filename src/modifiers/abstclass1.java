package modifiers;

public class abstclass1 {
    public static void main(String[] args)
    {
        abst1 obj=new abst1();
        System.out.println("name:"+obj.str);
        System.out.println("age:"+obj.a);
        System.out.println("name:"+obj.Str1);
        obj.abst(); //calling abstract method

    }
}
