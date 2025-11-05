package Constructorscode;

public class copyconstructor{
    int age;
    String name;
    int mobilenumber;
    copyconstructor(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    copyconstructor(int mobilenumebr)
    {
        this(22,"sreeja");
        this.mobilenumber=mobilenumber;
    }
    void details()
    {
        System.out.println("NAME: "+ name +" AGE:" +age + " MOBILE NUMBER:" +mobilenumber);
    }
    public static void main(String[] args)
    {
        copyconstructor obj=new copyconstructor(20,"navaneetha");
        copyconstructor obj2=new copyconstructor(22,"vaishu");
        obj.details();
        obj2.details();
        copyconstructor obj3=new copyconstructor(1234567893);
        obj3.details();
    }

}
