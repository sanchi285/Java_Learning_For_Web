package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("anil",890);
        map1.put("rahim",8976);
        map1.put("baller",900);
        map1.put("rahim1",8976);
        map1.put("baller1",900);

        //groupBy
        Map<Integer, List<Map.Entry<String, Integer>>> map = map1.entrySet()
                                                            .stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue));

        System.out.println(map);


        getNthHeighstSalary(1,map1);
    }

    public static Map.Entry<String, Integer> getNthHeighstSalary(int num, Map<String, Integer> map){

        Map.Entry <String,Integer> res =   map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num-1);

        System.out.println(res);
        return res;
    }


}