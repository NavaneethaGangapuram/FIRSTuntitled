package IteratorAlgorithmPack;

import java.util.ArrayList;
import java.util.*;

public class Alg {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(41);
        numbers.add(82);
        numbers.add(22);
        numbers.add(60);
        numbers.add(36);
        numbers.add(95);
        numbers.add(45);
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        System.out.println(numbers);
        int count=Collections.frequency(numbers,95);
        System.out.println(count);
        System.out.println("maximum numbers among  "+numbers +Collections.max(numbers));
        System.out.println("minimum numbers among  "+numbers +Collections.min(numbers));
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.swap(names,0,1);
        System.out.println(names);



    }
}
