package com.srimannr.collections;

// Make objects Comparable
// For tree collections
// eg : TreeSet, TreeMap

import java.util.Comparator;
import java.util.TreeSet;

record Student(String name, int sid, double score) {
}

class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//       return (o1.score() > o2.score()) ? -1 : ((o1.score() == o2.score()) ? 0 :  1);
        return Double.compare(o1.score(), o2.score()) * -1;
    }
}

public class Collections5 {
    static void main() {
        // Fruit and CustomFruit defined in Collection4.java

        //First method
//        TreeSet<CustomFruit> tset = new TreeSet<>(Comparator.<CustomFruit,String>comparing(p -> p.name.toLowerCase()).reversed());

        //Second Method
//        TreeSet<CustomFruit> tset = new TreeSet<>(new Comparator<CustomFruit>() {
//            @Override
//            public int compare(CustomFruit o1, CustomFruit o2) {
//                return o1.name.compareToIgnoreCase(o2.name);
//            }
//        });
        //Third method
        TreeSet<CustomFruit> tset = new TreeSet<>((o1, o2) -> o1.name.compareToIgnoreCase(o2.name));
        tset.add(new CustomFruit("Apple"));
        tset.add(new CustomFruit("Custard Apple"));
        tset.add(new CustomFruit("Banana"));
        tset.add(new CustomFruit("banana"));
        System.out.println(tset);
        TreeSet<Fruit> tsfruit = new TreeSet<>();
        tsfruit.add(new Fruit("Apple"));
        tsfruit.add(new Fruit("Custard Apple"));
        tsfruit.add(new Fruit("Banana"));
        tsfruit.add(new Fruit("banana"));
        tsfruit.add(new Fruit("Dragon Fruit"));
        System.out.println(tsfruit);
        TreeSet<Student> stdSet = new TreeSet<>(new ScoreComparator());
        stdSet.add(new Student("Sriman", 101, 100));
        stdSet.add(new Student("Rajeev", 102, 89));
        stdSet.add(new Student("Ravi", 103, 79));
        System.out.println(stdSet);

    }
}
