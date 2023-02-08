package lamdademo;

@FunctionalInterface
interface MyLambda {
    public void Display();
}
@FunctionalInterface
interface Parameterized{
    public int add(int a, int b);
}

public class LambdaDemo {

    public static void main(String[] args){
        MyLambda ml = ()->{
            System.out.println("Hello world");
        };
        ml.Display();

        Parameterized pm = (a,b)->{return a+b;};
        System.out.println(pm.add(23,50));

        //anothe way
        pm = (a, b) -> a*b;

        System.out.println(pm.add(10,30));

    }
}
