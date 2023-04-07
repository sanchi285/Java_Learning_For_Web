package CollectionsDemo;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args){
        System.out.println("Linked Hash Map");
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5);
        lhm.put(1,"A");
        lhm.put(3,"H");
        lhm.put(5,"5");
        lhm.put(6,"H");
        lhm.put(7,"O");
        lhm.put(9,"P");

        lhm.forEach((k,v)->System.out.println(k+" "+v));
    }
}
