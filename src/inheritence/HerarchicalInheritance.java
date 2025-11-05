package inheritence;

public class HerarchicalInheritance {
    public static void main(String[] args)
    {
        bike b=new bike();
        b.run();
        b.two_wheeler();
        Auto a=new Auto();
        a.run();
        a.three_wheeler();
        Car c=new Car();
        c.run();
        c.four_wheeler();
        Truck t=new Truck();
        t.run();
        t.goodsCarrier();


    }
}
