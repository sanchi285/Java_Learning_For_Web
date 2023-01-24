package exceptiondemo;

public class NestedCatch {
    public static void main(String[] args){
        int A[] = {10,20,30,40,0};
        try {
            int c = A[0]/A[4];
            System.out.println("Devision is "+c);

            try {
                System.out.println(A[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("index invalid");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }

    }
}
