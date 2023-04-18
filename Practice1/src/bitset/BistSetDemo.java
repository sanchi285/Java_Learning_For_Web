package bitset;

import java.util.BitSet;
import java.util.*;
public class BistSetDemo {

    public static void main(String[] args){
        BitSet bs1= new BitSet();
        BitSet bs2= new BitSet();
        bs1.set(1);
        bs1.set(4);
        bs1.set(5);
        System.out.println(bs1);
        System.out.println(bs1.get(0));

        bs2.or(bs1);
        System.out.println(bs2);


    }

}
