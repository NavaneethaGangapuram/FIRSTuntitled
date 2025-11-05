package LIST;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class COMMON_LIST {
    public static void main(String[] args){
        List<String>  fruits=new ArrayList<String>();
        System.out.println("********************************ADD METHOD*****************************");
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pine apple");
        fruits.add("orange");
        System.out.println(fruits);
        System.out.println("********************************USING FOR LOOP*****************************");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println("********************************GET METHOD*****************************");
        /*get method used to print the value at specified position*/
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(3));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(1));
        System.out.println("********************************SET METHOD*****************************");
        /*set method is used to replace element at specified position*/
        System.out.println(fruits.set(1,"mango"));
        System.out.println(fruits.set(0,"grapes"));
        System.out.println(fruits.set(2,"pineapples"));
        System.out.println(fruits.set(3,"kiwi"));
        System.out.println(fruits.set(4,"custardapple"));
        System.out.println(fruits);
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println("********************************SIZE METHOD*****************************");
        /*Size method used to represent the length of an list*/
        System.out.println(fruits.size());
        System.out.println("********************************REMOVE METHOD*****************************");
        /*remove method used to remov ethe item at specified position*/
        System.out.println(fruits.remove(2));
        System.out.println(fruits.remove(0));
        System.out.println(fruits.remove(1));
        System.out.println(fruits);
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        Collections.sort(fruits);
        System.out.println(fruits);




    }
}






















