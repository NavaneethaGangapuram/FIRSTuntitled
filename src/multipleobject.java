public class multipleobject {
    int a=10;
    int b=15;
    int fact=1;
    public static void main(String[] args) {
        multipleobject obj=new multipleobject();
        System.out.println("a="+obj.a);
        System.out.println("b="+obj.b);
        System.out.println("the addition of two numbers is: "+obj.a+obj.b);
        System.out.println("the subtraction of two numbers is: "+obj.a+obj.b);
        System.out.println("the multiplication of two numbers is: "+obj.a*obj.b);
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            obj.fact=obj.fact*i;

        }
        System.out.println("the factorial of a numbers is: "+obj.fact);
        multipleobject1 obj1=new multipleobject1();
        obj1.prime();
        mulltipleobjec2 object=new mulltipleobjec2();
        object.additon();


    }

}
/*multiple classes are used call differnet number of classes to main method
we can also create multiple classes
 */
