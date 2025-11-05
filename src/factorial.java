public class factorial{
    public static void main(String[] args)
    {
        //i am assign 1 value to variable fact
        int fact=1;
        //i am using "for" loop "i=1"-starts from 1 ,"i<=5"-it iterates 5times ,"i++"-for every iteration i value is incremented by 1
        for(int i=1;i<=5;i++)
        {
            //since fact value starts from 1 so from every iteration i value increases until it reaches the 5
            fact=fact*i;
        }
        System.out.println("factorial of 5 is:"+fact);
    }
}

