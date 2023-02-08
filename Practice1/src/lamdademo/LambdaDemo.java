package lamdademo;

@FunctionalInterface
interface MyLambda {
    public void Display();
}
public class LambdaDemo {

    public static void main(String[] args){
        MyLambda ml = ()->{
            System.out.println("Hello world");
        };

        ml.Display();

    }
}
