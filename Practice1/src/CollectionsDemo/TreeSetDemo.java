package CollectionsDemo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(5);
        treeSet.add(450);
        treeSet.add(55);
        treeSet.forEach(x-> System.out.println(x));

        TreeSet<String> treeSetStr = new TreeSet<>();
        treeSetStr.add("a");
        treeSetStr.add("b");
        treeSetStr.add("ab");
        treeSetStr.add("bc");
        treeSetStr.add("aaab");

        treeSetStr.forEach(x-> System.out.println(x));


    }

}
