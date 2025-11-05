package Constructorscode;

public class constructor {
    int modelyear;
    String modelname;
    constructor(String modelname)
    {
        this(2020,modelname);
    }
    constructor(int modelyear,String modelname)
    {
        this.modelyear=modelyear;
        this.modelname=modelname;
    }
    void printinfo()
    {
        System.out.println(" MODELYEAR: "+modelyear+ " MODELNAME: "+modelname);
    }
    public static void main(String[] args)
    {
        constructor obj=new constructor("Corvette");
        obj.printinfo();
        constructor obj2=new constructor(1969, "Mustang");
        obj2.printinfo();

    }
}
