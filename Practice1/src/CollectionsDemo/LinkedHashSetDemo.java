package CollectionsDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
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
