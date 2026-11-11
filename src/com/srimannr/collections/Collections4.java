package com.srimannr.collections;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

record Fruit(String name) implements Comparable<Fruit>{
    @Override
    public int compareTo(@NotNull Fruit o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
class CustomFruit{
    String name;

    public CustomFruit(String n){
       this.name = n;
    }

    @Override
    public String toString() {
        return "CustomFruit{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
     public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomFruit that = (CustomFruit) obj;
        return this.name.equalsIgnoreCase(that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name.toLowerCase());
    }
}

public class Collection4 {
    static void main(String[] args) {
        HashSet<Fruit> set = new HashSet<>();
        set.add(new Fruit("Apple"));
        set.add(new Fruit("Banana"));
        set.add(new Fruit("Apple"));
        LinkedHashSet<CustomFruit> lhs = new LinkedHashSet<>();
        lhs.add(new CustomFruit("Mango"));
        lhs.add(new CustomFruit("Banana"));
        lhs.add(new CustomFruit("manGo"));
        System.out.println(set);
        System.out.println(lhs);
    }
}