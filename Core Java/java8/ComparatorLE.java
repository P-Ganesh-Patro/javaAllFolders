// package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorLE {
    public static void main(String[] args) {

        // List<Integer> al = new ArrayList<Integer>();
        // al.add(20);
        // al.add(30);
        // al.add(13);
        // al.add(9);
        // al.add(12);
        // Collections.sort(al, (a, b) -> a-b);
        // System.out.println(al);

        Set<Integer> hs = new HashSet<Integer>();
        hs.add(20);
        hs.add(90);
        hs.add(20);
        hs.add(89);
        hs.add(12);
        // System.out.println(hs);

        Set<Integer> ts = new TreeSet<Integer>((a, b) -> b - a);
        ts.add(20);
        ts.add(90);
        ts.add(20);
        ts.add(89);
        ts.add(12);
        // System.out.println(ts);

        Map<String, String> mp = new TreeMap<String, String>();
        mp.put("name", "ganesh");
        mp.put("name1", "punit");
        mp.put("name2", "ram");
        mp.put("name3", "manaj");
        mp.put("name4", "aaksah varma");
        mp.put("name5", "arvind");
        // System.out.println("default console:- " + mp);

        Map<Integer, String> mp1 = new TreeMap<Integer, String>((a, b) -> b - a);
        mp1.put(1, "ganesh");
        mp1.put(2, "punit");
        mp1.put(3, "ram");
        mp1.put(4, "saikiran");
        mp1.put(5, "manaj");
        mp1.put(6, "aaksah varma");
        mp1.put(7, "arvind");
        // System.out.println("desending order:- " + mp1);
        student s1 = new student(101, "Manaj Naidu");
        student s2 = new student(110, "Ram suhad");
        student s3 = new student(131, "aakash varma");
        student s4 = new student(181, "saikiran");
        List<student> al = new ArrayList<student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        Collections.sort(al, (a, b) -> b.name.compareTo(a.name));
        System.out.println(al);
    }

    static class student {
        public Integer id;
        public String name;

        student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "student [id=" + id + ", name=" + name + "]";
        }
    }

}
