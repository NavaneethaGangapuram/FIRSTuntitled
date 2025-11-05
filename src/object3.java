public class object3 {
    int a=15;
    void method()
    {
        int a=16;
        System.out.println(a);
        System.out.println("i am navaneetha");
    }
    public static void main(String args[])
    {
        object3 oj1=new object3();

        System.out.println("a="+oj1.a);
        oj1.method();
        //System.out.println("a="+a);
        int a=17;
        System.out.println(a);
    }

}
