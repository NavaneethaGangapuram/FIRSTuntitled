package modifiers;

public class privatemodifiermain {
    public static void main(String[] args)
    {
        privatemodifier obj=new privatemodifier();
        System.out.println(obj.add1(2,3));
    }

}
//we cannot access diretly the values if we declare with private keyword.
//private keyword helps to use that value within the class