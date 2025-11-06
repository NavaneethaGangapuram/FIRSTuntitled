package FILES;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String args[]){
        try {
            FileWriter fw = new FileWriter("C:\\Users\\NAVANEETHJA\\OneDrive\\Documents\\navaneetha\\navani.txt");
            fw.write("Java is a high-level, object-oriented programming language developed by James Gosling and his team at Sun Microsystems in the early 1990s. Originally called Oak, it was designed for embedded systems and later renamed Java. Officially released in 1995, Java introduced the revolutionary concept of \"Write Once, Run Anywhere,\" thanks to its platform-independent Java Virtual Machine (JVM). Over the years, Java evolved through multiple versions, adding features like generics, lambda expressions, and modules. It became a dominant language for enterprise applications, Android development, and web-based systems. Today, Java remains one of the most widely used and influential programming languages in the world.");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
