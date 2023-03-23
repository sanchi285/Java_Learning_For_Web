package CollectionsDemo;

import javax.swing.*;
import java.util.Map.*;
import java.util.TreeMap;

public class MapDemo {


    public static void main(String[] args){
        TreeMap<Integer,String> Map = new TreeMap<>();
        Map.put(1,"Bismoy");
        Map.put(5,"Bear");
        Map.put(10,"Bull");

        Entry<Integer,String> e = Map.firstEntry();
        System.out.println(Map);
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(Map.ceilingEntry(6));
        System.out.println(Map.floorEntry(6));
    }

}
