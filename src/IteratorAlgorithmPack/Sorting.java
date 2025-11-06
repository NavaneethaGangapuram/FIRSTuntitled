package IteratorAlgorithmPack;
import java.util.*;

public class Sorting {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        Collections.sort(numbers);
        System.out.println(numbers);
        for(Integer i:numbers){
            System.out.println(i);
        }

    }
}
