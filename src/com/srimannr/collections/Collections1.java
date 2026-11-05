package com.srimannr.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections1 {
    static void main(String[] args) {
        int[] a = {2,2,3,4,5,5,1};
        TreeSet<Integer> hs = new TreeSet<>();
//        HashSet<Integer> hs = new HashSet<>();
//        TreeSet<Integer> hs = new TreeSet<>();

        for(int num : a){
            if (! hs.add(num)) {
                System.out.println("Duplicate number " + num);
            }
        }

//        Iterator<Integer> it = hs.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        System.out.println(hs);
    }
}
