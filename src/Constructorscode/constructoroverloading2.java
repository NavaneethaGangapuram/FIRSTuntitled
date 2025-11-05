package Constructorscode;

public class constructoroverloading2 {

    constructoroverloading2(int a,int b){
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else if(a<b)
            {
            System.out.println("b is greater than a");
            }
        else
        {
            System.out.println("a is eqaul to b");
        }
    }
    constructoroverloading2(int a,int b,int c){
        this(12,16);
        if(a<b&&a<c)
        {
            System.out.println("a is having minimum value");
        }
        else if(b<a&&b<c)
        {
            System.out.println("b is having minimum value");
        }
        else
        {
            System.out.println("c is having minimum value");
        }

    }
    constructoroverloading2(int num)
    {
        this(12,45,67);
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
    constructoroverloading2(){
        this(13);
    }
    public static void main(String[] args)
    {
        constructoroverloading2 obj=new constructoroverloading2();
    }
}
/*here we are using one obejct
the object is created with default parameters
is goes to the method which is having no parameters and then it goes to
 this(13)-executes the code and process continuous
 */