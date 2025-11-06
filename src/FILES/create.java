package FILES;
import java.io.File;
import java.io.IOException;
public class create {
    public static void main(String args[]){
        try{
            File f=new File("C:\\Users\\NAVANEETHJA\\OneDrive\\Documents\\navaneetha\\navani.txt");
            if(f.createNewFile()){
                System.out.println("File is created "+f.getName());
            }
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}

