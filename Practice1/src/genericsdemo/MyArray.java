package genericsdemo;

public class MyArray <T>{

    T A[] = (T[]) new Object[10];
    int ptr = 0;

    public void add(T val){
        A[ptr] = val;
        ptr++;
    }

    public void printArray(){
        for(int i=0;i<ptr;i++){
            System.out.println(A[i]);
        }
    }

}
