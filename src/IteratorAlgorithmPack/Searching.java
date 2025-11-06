package IteratorAlgorithmPack;
import java.util.*;

public class Searching {
    public static void main(String[] args){
        ArrayList<String> indoorgames=new ArrayList<String>();
        indoorgames.add("Carrom");
        indoorgames.add("Chess");
        indoorgames.add("Puzzles");
        indoorgames.add("Ludo");
        System.out.println(indoorgames);
        try {
            for (int i = 0; i <= indoorgames.size(); i++) {
                System.out.println(indoorgames.get(i));
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("error");
            }
        int index=Collections.binarySearch(indoorgames,"Puzzles");
        System.out.println(index);
        for(String s:indoorgames){
            System.out.println(s);
        }
    }
}
