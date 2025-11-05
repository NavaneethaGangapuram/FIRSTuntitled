public class object2 {
    String str="navaneetha";
    String str2="gangapuram";
    int a=10;
    int b=15;
    public static void main(String args[])
    {
        object2 obj=new object2();

        System.out.println("the first string is: "+obj.str);
        System.out.println("the second string is: "+obj.str2);
        System.out.println("the first integer  is: "+obj.a);
        System.out.println("the second integer  is: "+obj.b);
        String s=obj.str+" "+obj.str2;
        System.out.println("the first string is: "+s);
        int s1=obj.a+obj.b;
        System.out.println("the second string is: "+s1);

    }
}
/*this program is all about how we are creating the object
object=when we are writing  code i.e after class and before main method then we need we call into the main method.
so we create an object in main method we is used call the variables
 */
