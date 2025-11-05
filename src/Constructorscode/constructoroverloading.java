package Constructorscode;

public class constructoroverloading {
    public constructoroverloading(){
        System.out.println("constructoroverloading");
    }
    public constructoroverloading(int a,int b){
        int c=a+b;
        System.out.println("Sum of two numbers is: "+c);
    }
    public constructoroverloading(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Sum of three numbers is: "+d);
    }
    public constructoroverloading(int marks,String name){
        if(marks>80)
        {
            System.out.println("student is excellent at studies: ");
        }
        else if(marks<80&&marks>60)
        {
            System.out.println("Student is average at studies: ");
        }
        else
        {
            System.out.println("Student is poor, they need to improve at studies: ");
        }
    }
    public static void main(String[] args)
    {
       constructoroverloading obj=new constructoroverloading(12,13);
       constructoroverloading obj1=new constructoroverloading(12,13,14);
       constructoroverloading obj2=new constructoroverloading(89,"navaneetha");

    }
}
//the code is about constructor overloading.i created different objects for different constructors

