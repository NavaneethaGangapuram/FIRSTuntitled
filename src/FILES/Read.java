package FILES;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\NAVANEETHJA\\OneDrive\\Documents\\navaneetha\\navani.txt");
             Scanner sc = new Scanner(fr)) {

            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
                System.out.println("Successfully read");
            }

        }
        catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}

