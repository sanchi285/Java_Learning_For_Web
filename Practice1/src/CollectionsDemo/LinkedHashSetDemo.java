package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        HashSet<String> lhs = new HashSet<>(10);
        lhs.add("A");
        lhs.add("B");
        lhs.add("J");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("C");
        lhs.forEach(System.out :: println);

    }
}
