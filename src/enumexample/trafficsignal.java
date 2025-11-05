package enumexample;


public class trafficsignal {
    enum Trafficsigns{
        GREENLIGHT,REDLIGHT,YELLOWLIGHT
    }
    public static void main(String[] args)
    {
        Trafficsigns t;
        t=Trafficsigns.REDLIGHT;
            if(t.toString()=="GREENLIGHT"){
                System.out.println("go");
            }
            else if(t.toString()=="YELLOWLIGHT"){
                System.out.println("wait");
        }
            else if(t.toString()=="REDLIGHT"){
                System.out.println("STOP");
            }

        }
    }

