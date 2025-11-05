/*
enum is a datatype used for declaring fixed set of constants

 */


package enumexample;

public class Videoactions {
    enum Actions{
        PLAY,PAUSE,STOP
    };
    public static void main(String[] args){
        Actions act=Actions.PLAY;
        System.out.println("video plays when we click on "+act);
        Actions a;
        a=Actions.STOP;{
            if(a.toString()=="PLAY"){
                System.out.println("video plays when we click on "+a);
            }
            else if(a.toString()=="PAUSE"){
                System.out.println("video got resules when we click on "+a);
            }
            else if(a.toString()=="STOP"){
                System.out.println("video plays when we click on "+a);
            }
        }
    }
}
