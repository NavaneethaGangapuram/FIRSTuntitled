package FILES;
import java.io.File;
public class delete {
    public static void main(String[] args){
        File df=new File("C:\\Users\\NAVANEETHJA\\OneDrive\\Documents\\navaneetha\\navani.txt");
        if(df.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("File not deleted successfully");
        }
    }
}
