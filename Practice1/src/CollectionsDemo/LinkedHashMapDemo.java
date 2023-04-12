package CollectionsDemo;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args){
        System.out.println("Linked Hash Map");
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>5;
            }
        };
        lhm.put(1,"A");
        lhm.put(3,"H");
        lhm.put(5,"5");
        String s = lhm.get(1);
        s = lhm.get(3);
        lhm.put(6,"H");
        lhm.put(7,"O");
        lhm.put(9,"P");
        lhm.put(10,"M");



        lhm.forEach((k,v)->System.out.println(k+" "+v));
    }
}
