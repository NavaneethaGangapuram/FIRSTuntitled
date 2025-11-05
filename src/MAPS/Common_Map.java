package MAPS;
import java.util.Map;
import java.util.HashMap;
public class Common_Map {
    public static void main(String[] args){
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("navani",554);
        obj.put("sreeja",6);
        obj.put("varsha",7);
        obj.put("kavya",1);
        System.out.println("***************************COMMON METHOD*************************");
        System.out.println(obj);
        System.out.println(obj.get("kavya"));
        System.out.println(obj.get("varsha"));
        System.out.println(obj.remove("navani"));
        System.out.println(obj.containsKey("varsha"));
        System.out.println(obj.containsValue("maggie"));
        System.out.println(obj);
        System.out.println(obj.keySet());
        for(String k:obj.keySet()){
            System.out.println(k);
        }
    }
}
