public class cars {
    public static void main(String[] args)
    {
        String[] cars={"Volvo", "BMW", "Ford", "Mazda"};
        int[] num={1,2,3,4};
        for(int number:num)
        {
            System.out.println(number);
        }
       for(String str:cars)
        {
            System.out.println(str);
        }
       cars[1]="opel";
       System.out.println(cars[1]);
       System.out.println(cars.length);
       System.out.println(num.length);
       System.out.println(cars[2]);
       for(int i=0;i<cars.length;i++)
       {
           System.out.println(cars[i]);
       }
       for(int i=0;i<num.length;i++)
       {
           System.out.println(num[i]);
       }
    }
}
