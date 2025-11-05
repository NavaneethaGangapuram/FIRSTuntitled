package Constructorscode;

public class constuctor1 {
    /*int a;
    int b;
    String str;*/
    constuctor1(){     //default constructor because no parameters were passing in method
        System.out.println("default constructor1");

    }
    constuctor1(int a,String str)      //parameterised constructor because parameters were passing in method
    {
        System.out.println(str+" age "+"is "+a);
    }
    public static void main(String[] args)
    {
        constuctor1 obj=new constuctor1(22,"navaneetha");
        //obj.constuctor1();
    }
}
