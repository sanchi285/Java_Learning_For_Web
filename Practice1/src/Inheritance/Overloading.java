package Inheritance;

class Test{

    public int max(int a, int b){
        if(a>b){return a;}
        else{return b;}
    }

    public int max(int a, int b ,int c){
        if(a>b && a>c){return a;}
        else if(b>c){return  b;}
        else{return c;}
    }
}


public class Overloading {
    public static void main(String[] args){
        Test a = new Test();
        System.out.println(a.max(3,4));
        System.out.println(a.max(7,12,9));
    }
}
