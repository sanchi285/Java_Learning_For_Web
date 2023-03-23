package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        //initialize an array
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(39);
        arrayList.add(99);
        arrayList.add(19);
        arrayList.forEach(x-> System.out.println(x));


    }

}
