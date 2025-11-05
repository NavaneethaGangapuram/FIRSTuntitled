package enumexample;

public class enumex1 {

    enum Days{
        Monday,tuesday,wednesday,thursday,friday,saturday,sunday
    }
    public static void main(String[] args) {
        Days day = Days.Monday;
        for(Days days:Days.values()){
            if(days.toString()=="tuesday")
            //if(days==Days.tuesday)
            System.out.println(days);
        }

    }
}
