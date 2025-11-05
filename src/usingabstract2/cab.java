package usingabstract2;

public class cab extends onlinevehicle{
    void pickup(String location){
        System.out.println("cab is arriving at "+location);
    }
    void dropdown(String destination){
        System.out.println("cab is reached at "+destination);
    }


}