package LIST;
import java.util.ArrayList;
import java.util.Collections;
public class ARRAY_LIST {
    public static void main(String[] args){
        ArrayList<String> subjects=new ArrayList<String>();
        System.out.println("###############################ARRAYLIST#################################");
        System.out.println("###############################ADD#################################");
        System.out.println(subjects.add("mathematics"));
        System.out.println(subjects.add("datastructures"));
        System.out.println(subjects.add("DBMS"));
        System.out.println(subjects.add("DAA"));
        System.out.println(subjects.add("Computer networks"));
        System.out.println(subjects.add("Machinelearning"));
        System.out.println(subjects);
        for(String sub:subjects){
            System.out.println(sub);
        }
        System.out.println("###############################GET#################################");
        System.out.println(subjects.get(1));
        System.out.println(subjects.get(0));
        System.out.println(subjects.get(2));
        System.out.println(subjects.get(3));
        System.out.println(subjects.get(4));
        System.out.println(subjects.get(5));
        System.out.println("###############################SET#################################");
        System.out.println(subjects.set(0,"COSM"));
        System.out.println(subjects.set(1,"Compiler design"));
        System.out.println(subjects.set(2,"JAVA"));
        System.out.println(subjects.set(3,"Discrete mathematics"));
        System.out.println(subjects.set(4,"datanalystics"));
        System.out.println(subjects.set(5,"STM"));
        System.out.println(subjects);
        System.out.println("###############################SIZE#################################");
        System.out.println(subjects.size());
        System.out.println("###############################REMOVE#################################");
        System.out.println(subjects.remove(4));
        System.out.println(subjects.remove(3));
        System.out.println(subjects);
        for(String sub:subjects){
            System.out.println(sub);
        }
        System.out.println("###############################SORT#################################");
        Collections.sort(subjects);
        System.out.println(subjects);
        System.out.println("###############################CLEAR#################################");
        subjects.clear();
        System.out.println(subjects);
    }
}
