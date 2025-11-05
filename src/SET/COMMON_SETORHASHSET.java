package SET;
import java.util.Set;
import java.util.HashSet;

public class COMMON_SETORHASHSET {
    public static void main(String[] args){
        Set<String> colors=new HashSet<String>();
        System.out.println("###############################ADD#################################");
        colors.add("pink");
        colors.add("black");
        colors.add("white");
        colors.add("black");
        colors.add("purple");
        System.out.println(colors);
        System.out.println(colors);
        System.out.println("###############################REMOVE#################################");
        System.out.println(colors.remove("pink"));
        System.out.println(colors.remove("black"));
        System.out.println(colors);
        System.out.println("###############################CONTAINS#################################");
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("brown"));
        System.out.println(colors.contains("purple"));
        System.out.println(colors);
        System.out.println("###############################SIZE#################################");
        System.out.println(colors.size());
        System.out.println("###############################CLEAR#################################");
        colors.clear();
        System.out.println(colors);
    }
}
