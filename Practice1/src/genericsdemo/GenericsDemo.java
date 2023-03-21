package genericsdemo;

class Test{
    int a;
    int b;
    public Test(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return a+"____"+b;
    }
}

public class GenericsDemo {


    //generic method
    public static  <T> void Shout(T shoutWith){
        System.out.println(shoutWith+" !!!! ");
    }

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

        Printer<Test> printer4 = new Printer(new Test(23,34));
        printer4.print();
        Shout(new Test(23,34));
        Shout("Hello");
    }
}
