package modifiers;

public class Publicprivate {
    private String name;
    public int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args)
    {
        //we are accessing age directly because we declared with public keyword
        Publicprivate obj=new Publicprivate();
        System.out.println("age of aperson:"+(obj.age=19));
        obj.setName("navaneetha");
        //we are accessing private variable through public method
        System.out.println("name is: "+(obj.getName()));

    }
}
