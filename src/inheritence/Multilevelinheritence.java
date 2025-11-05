package inheritence;

//main class and method
public class Multilevelinheritence{
    public static void main(String[] args){
        Job obj=new Job();
        //from Man class
        obj.displayman();
        //From Student class
        obj.studying();
        //from Gradauted class
        obj.study_completed();
        // from job class
        obj.working();
    }
}
