public class method5 {
    static void mymethod6(int a)//a-number of terms
    {
        for(int i=0;i<=a;i++)
        {
            if(i%2==0)
            {
                System.out.println("even"+i);
            }
            else
            {
                System.out.println("odd"+i);
            }
        }

    }
public static void main(String[] args)
{
    mymethod6(4);
}

}
