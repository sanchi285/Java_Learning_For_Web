package genericsdemo;

class Test{
    int a;
    int b;
    public Test(int a, int b){
        this.a=a;
        this.b=b;
    }
    public Test(){
    }

    @Override
    public String toString() {
        return a+"____"+b;
    }
}

class Test2 extends Test{
}

class GenericTest <T extends Test>{
    T mytype;
    public GenericTest(T tp){
        this.mytype = tp;
    }

    public void print(){
        System.out.println(mytype);
    }
}


class  Test3 extends Test{

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

        Mylist<String> mylist =  new Mylist<>();
        mylist.add("I");
        mylist.add("O");
        mylist.add("U");
        mylist.show();
        mylist.show();

        Mylist<Integer> mylistInt = new Mylist<>();
        mylistInt.add(845);
        mylistInt.add(245);
        mylistInt.add(145);
        mylistInt.add(245);
        mylistInt.add(245);
        mylistInt.show();

        MyArray2<String> myArray2 = new MyArray2<>();
        myArray2.add("Jhony");
        myArray2.add("Jhony2");
        myArray2.add("Yes");

        myArray2.printArray();

    }
}
