package usingabstract1;

public class main {
    public static void main(String[] args){
//        tester s=new tester();
//        design t=new design();
//        developer d=new developer();
//        s.work("TESTER");
//        t.work("DESIGNER");
//        d.work("DEVELOPER");
        ITindustry itIndustry;

        itIndustry=new tester();
        itIndustry.work("tester");
        itIndustry=new developer();
        itIndustry.work("developer");
        itIndustry=new design();
        itIndustry.work("designer");





    }
}
