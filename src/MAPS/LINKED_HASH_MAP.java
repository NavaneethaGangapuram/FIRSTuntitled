package MAPS;
import java.util.LinkedHashMap;

public class LINKED_HASH_MAP {
    public static void main(String[] args){
        LinkedHashMap<String,String> symbols=new LinkedHashMap<String,String>();
        System.out.println("***************************PUT*************************");
        symbols.put("multiplication","a*b");
        symbols.put("divison","a/b");
        symbols.put("addition","a+b");
        symbols.put("subtarction","a-b");
        symbols.put("module","a%b");
        System.out.println(symbols);
        System.out.println("***************************COMMON METHOD*************************");


    }
}
