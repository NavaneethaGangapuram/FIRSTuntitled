package LIST;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LIST_SORTING {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("m");
        list.add("d");
        list.add("l");
        list.add("z");
        list.add("q");
        Collections.sort(list);
         System.out.println(list);
         for(String l:list){
             System.out.println(l);
         }
         Collections.sort(list,Collections.reverseOrder());
         System.out.println(list);
         for(String l:list){
             System.out.println(l);
         }
    }

}
