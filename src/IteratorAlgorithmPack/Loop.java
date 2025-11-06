package IteratorAlgorithmPack;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Loop {
    public static void main(String args[])
    {
        Set<String> internals=new HashSet<String>();
        internals.add("CNS");
        internals.add("CD");
        internals.add("STM");
        internals.add("CN");
        internals.add("ML");
        System.out.println(internals);
        for(String i:internals)
        {
            System.out.println(i);
        }
        Iterator<String> i=internals.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
