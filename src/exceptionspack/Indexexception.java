package exceptionspack;

public class Indexexception {
    public static void main(String[] args)
    {
        try{
            int[] numbers={1,2,3,4,5};
            System.out.println(numbers[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("something went wrong "+e.getMessage());
        }

    }
}
