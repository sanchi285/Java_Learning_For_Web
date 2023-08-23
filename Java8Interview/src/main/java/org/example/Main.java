package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("anil",890);
        map1.put("rahim",8976);
        map1.put("baller",900);

      Map.Entry <String,Integer> res =   map1.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toList())
                                        .get(1);

        System.out.println(res);
    }
}