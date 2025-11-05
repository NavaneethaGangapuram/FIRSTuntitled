package SET;
import java.util.Set;
import java.util.TreeSet;

public class TREESET {
    public static void main(String[] args)
    {
        Set<String> jobs=new TreeSet<>();
        System.out.println("###############################ADD#################################");
        jobs.add("developer");
        jobs.add("tester");
        jobs.add("projectmanager");
        jobs.add("admin");
        jobs.add("tean lead");
        jobs.add("designer");
        System.out.println(jobs);
        for(String j:jobs){
            System.out.println(j);
        }
        System.out.println("###############################SIZE#################################");
        System.out.println(jobs.size());
        System.out.println("###############################CONTAINS#################################");
        System.out.println(jobs.contains("CEO"));
        System.out.println(jobs.contains("developer"));
        System.out.println(jobs.contains("clints"));
        System.out.println(jobs);
        System.out.println("###############################REMOVE#################################");
        System.out.println(jobs.remove("admin"));
        System.out.println(jobs.remove("clints"));
        System.out.println(jobs);
        System.out.println("################################CLEAR################################");
        jobs.clear();
        System.out.println(jobs);


    }
}
