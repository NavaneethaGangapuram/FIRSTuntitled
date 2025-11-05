public class reverse1 {
    public static void main(String[] args)
    {
        //here we are assigning two strings i.e str and reversed since we need to store characters in reverse order we are considering reversed variable
        String str = "computer";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed=reversed+str.charAt(i);
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
//example i=8-1=7 is index value,1>=0 that means the i values stores from the 7,i--=for every iteration the i value increases
//charAt() is used to store the charaters of position of i
