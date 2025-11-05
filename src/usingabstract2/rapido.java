package usingabstract2;

public class rapido extends onlinevehicle{
    void pickup(String location){
        System.out.println("picking up at "+location);
    }
    void dropdown(String destination){
        System.out.println("reached at "+destination);
    }
}
