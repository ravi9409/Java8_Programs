package lambdasinaction.appa.lambdaexpression;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Functional_Interface_Examples {
    public static void main(String[] args) {
        //Runnable thread implementation using java 8
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("Main Thread");

        //Sorting the arraylist
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(20);
        al.add(15);
        al.add(25);
        System.out.println("Before Sorting:" + al);
        Collections.sort(al, (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
        System.out.println("After Sorting:" + al);

        //Sorting the Treeset
        TreeSet<Integer> ts = new TreeSet<>((i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
        ts.add(10);
        ts.add(5);
        ts.add(20);
        ts.add(15);
        ts.add(25);
        System.out.println("After Sorting:" + ts);
        //Sorting the TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>((i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0);
        tm.put(10, "A");
        tm.put(5, "B");
        tm.put(20, "C");
        tm.put(15, "D");
        tm.put(25, "E");
        System.out.println("After Sorting:" + tm);


    }
}