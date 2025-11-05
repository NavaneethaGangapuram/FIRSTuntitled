package DateTimepack;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversion {
    public static void main(String[] args)
    {
        LocalDateTime befor=LocalDateTime.now();
        System.out.println("Before changing pattern of date and time is: "+befor);
        DateTimeFormatter after=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formated=befor.format(after);
        System.out.println("After changing pattern of date and time is: "+formated);
    }

}
