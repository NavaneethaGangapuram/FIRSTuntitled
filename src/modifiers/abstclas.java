package modifiers;

abstract class abstclas {         //abstract class
    public int a=12;
    public String str="navaneetha";
    public abstract void abst();     //abstarct method
}
class abst1 extends abstclas {
    public String Str1="gangapuram ";
    public void abst()
    {
        System.out.println("this is an example of abstract class and abstract method");
    }

}
