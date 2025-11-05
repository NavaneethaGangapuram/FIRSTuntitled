package SET;
import java.util.Set;
import java.util.LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class LINKEDHASHSET {
    public static void main(String[] args)
    {
        Set<String> course=new LinkedHashSet<>();
        System.out.println("###############################ADD#################################");
        course.add("CSE");
        course.add("IT");
        course.add("ECE");
        course.add("EEE");
        course.add("ME");
        course.add("CE");
        System.out.println(course);
        for(String j:course){
            System.out.println(j);
        }
        System.out.println("###############################SIZE#################################");
        System.out.println(course.size());
        System.out.println("###############################CONTAINS#################################");
        System.out.println(course.contains("EEE"));
        System.out.println(course.contains("CSCD"));
        System.out.println(course.contains("CSAIML"));
        System.out.println(course);
        System.out.println("###############################REMOVE#################################");
        System.out.println(course.remove("CSCD"));
        System.out.println(course.remove("ME"));
        System.out.println(course);
        System.out.println("################################CLEAR################################");
        course.clear();
        System.out.println(course);


    }
}
