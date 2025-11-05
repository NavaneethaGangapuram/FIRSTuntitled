package MAPS;
import java.util.TreeMap;

public class TREE_MAP {
    public static void main(String[] args){
        TreeMap<String,String> keyvalue=new TreeMap<String,String>();
        System.out.println("***************************PUT*************************");
        keyvalue.put("telangana","hyderabad");
        keyvalue.put("andhrapradesh","amaravathi");
        keyvalue.put("Karnataka","banglore");
        keyvalue.put("tamilnadu","chennai");
        System.out.println(keyvalue);
        System.out.println("***************************GET*************************");
        System.out.println(keyvalue.get("telangana"));
        System.out.println(keyvalue.get("andhrapradesh"));
        System.out.println(keyvalue.get("Karnataka"));
        System.out.println(keyvalue.get("tamilnadu"));
        System.out.println("***************************REMOVE*************************");
        System.out.println(keyvalue.remove("telangana"));
        System.out.println(keyvalue);
        System.out.println("***************************SIZE*************************");
        System.out.println(keyvalue.size());
        System.out.println("***************************LOOP*************************");
        for(String key:keyvalue.keySet()){
            System.out.println(key);
        }
        for(String value:keyvalue.values()){
            System.out.println(value);
        }
        System.out.println("***************************CLEAR*************************");
        keyvalue.clear();
        System.out.println(keyvalue);
    }
}
