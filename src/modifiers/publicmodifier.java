package modifiers;

public class publicmodifier {
    public String str1;
    public String str2;
    public String str3;
    String strconcating() {
        str1 = "navaneetha ";
        str2 = "gangapuram ";
        str3 = str1 + str2;
        System.out.println("concatination is :" + str3);
        return str3;
    }
    public static void main(String[] args)
    {
        publicmodifier obj=new publicmodifier();
        obj.strconcating();
    }

}
