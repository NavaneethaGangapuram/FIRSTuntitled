package MAPS;
import java.util.HashMap;

public class HASH_MAP {
    public static void main(String args[]){
        HashMap<Integer,String> std=new HashMap<Integer,String>();
        {
            System.out.println("**************************PUT*************************");
            std.put(1,"navani");
            std.put(2,"sreeja");
            std.put(3,"vasrha");
            std.put(4,"Akshaya");
            std.put(5,"kavya");
            System.out.println(std);
            System.out.println("***************************GET*************************");
            System.out.println(std.get(1));
            System.out.println(std.get(2));
            System.out.println(std.get(3));
            System.out.println(std.get(4));
            System.out.println(std.get(5));
            System.out.println("***************************SIZE*************************");
            System.out.println(std.size());
            System.out.println("***************************REMOVE*************************");
            System.out.println(std.remove(5));
            System.out.println(std.remove(4));
            System.out.println(std);
            System.out.println("***************************LOOP*************************");
            for(Integer key:std.keySet()){
                System.out.println(key);
            }
            for(String value:std.values()){
                System.out.println(value);
            }
            System.out.println("***************************CLEAR*************************");
            std.clear();
            System.out.println(std);

        }
    }
}
