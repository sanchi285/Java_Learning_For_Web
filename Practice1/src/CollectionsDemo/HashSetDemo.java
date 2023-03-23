package CollectionsDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(23);
        hashSet.add(45);
        hashSet.add(23);
        hashSet.add(45);
        hashSet.forEach(x-> System.out.println(x));

    }

}
