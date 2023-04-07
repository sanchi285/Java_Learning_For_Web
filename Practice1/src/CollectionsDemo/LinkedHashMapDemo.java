package CollectionsDemo;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args){
        System.out.println("Linked Hash Map");
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true);
        lhm.put(1,"A");
        lhm.put(3,"H");
        lhm.put(5,"5");
        lhm.put(6,"H");
        lhm.put(7,"O");
        lhm.put(9,"P");
        lhm.put(10,"M");

        String s = lhm.get(1);
        s = lhm.get(3);

        lhm.forEach((k,v)->System.out.println(k+" "+v));
    }
}
