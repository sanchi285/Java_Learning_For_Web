package genericsdemo;

public class GenericsDemo {
    public static void main(String[] agrs){
        Printer<Integer> printer1 = new Printer(90);
        printer1.print();
        Printer<Double> printer2 = new Printer(90.9);
        printer2.print();
        Printer<String> printer3 = new Printer("Hello Man");
        printer3.print();
        MyArray<String> artA =  new MyArray<>();
        artA.add("hello");
        artA.add("world");
        artA.printArray();

    }
}
