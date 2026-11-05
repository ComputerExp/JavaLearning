package com.srimannr.collections;

import java.util.*;

public class Collections3 {
    public static void main(String[] args) {
        String sentence = "this is sample sentence this is for map example";
        String[] words = sentence.split(" ");
        LinkedHashMap<String,Integer> hmp = new LinkedHashMap<>();
        for (String word : words) {
            hmp.put(word,hmp.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hmp.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list = list.reversed();
        for(Map.Entry<String,Integer> entry : list){
            hmp.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Sentence is: "+ sentence);
        System.out.println("-- Frequency -- ");

        for (String key : hmp.keySet()){
            System.out.println(key + " : " + hmp.get(key));
        }
    }
}
