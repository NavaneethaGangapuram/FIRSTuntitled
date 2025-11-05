public class fact {
    public static void main(String[] args)
    {
        int fact1=1;
        int i=1;
        while(i<=5)
        {
            //System.out.println(i);
            fact1=fact1*i;
            i++;
        }
        System.out.println("Tne factorial of a number is:"+fact1);
    }
}
